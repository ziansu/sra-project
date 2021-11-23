@java.lang.Override
public org.nlamah.QLS.Model.Abstract.QLSNode visit(org.nlamah.QLS.Model.StylesheetBlock.StyledQuestion styledQuestion) {
    org.nlamah.QBase.QBaseQuestionType formQuestionType = org.nlamah.QLS.Helper.QLSHelper.getTypeForStyledQuestion(styledQuestion, formQuestions);
    if (formQuestionType != (currentWidgetDeclaration.returnType())) {
        errors.add(new org.nlamah.QLS.Error.WidgetTypeMismatchError(currentWidgetDeclaration, formQuestionType));
    }
    return null;
}