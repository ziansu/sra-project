@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (compareOnlyQuestionText) {
        org.nlamah.QL.Model.Form.Abstract.FormQuestion value = ((org.nlamah.QL.Model.Form.Abstract.FormQuestion) (object));
        if (this.questionText.equals(value.questionText)) {
            return true;
        }
        return false;
    }else {
        if (!(super.equals(object))) {
            return false;
        }
        if (!(object instanceof org.nlamah.QL.Model.Form.Abstract.FormQuestion)) {
            return false;
        }
        return true;
    }
}