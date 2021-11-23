@java.lang.Override
public void visit(qls.astnodes.sections.Section section) {
    for (qls.astnodes.sections.Section subSection : section.getSections()) {
        subSection.accept(this);
    }
    for (qls.astnodes.sections.DefaultStyle style : section.getDefaultStyles()) {
        if (!(style.getWidget().isUndefined())) {
            currentDefaultWidget = style.getWidget();
        }
    }
    for (qls.astnodes.sections.StyleQuestion question : section.getQuestions()) {
        question.accept(this);
    }
}