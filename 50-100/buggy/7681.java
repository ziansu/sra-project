@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(super.equals(object))) {
        return false;
    }
    if (!(object instanceof org.nlamah.QL.Model.Form.Abstract.FormQuestion)) {
        return false;
    }
    org.nlamah.QL.Model.Form.Abstract.FormQuestion value = ((org.nlamah.QL.Model.Form.Abstract.FormQuestion) (object));
    if (compareOnlyQuestionText) {
        if (this.questionText.equals(value.questionText)) {
            return true;
        }
    }
    return true;
}