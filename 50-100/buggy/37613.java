public void btnSave() {
    if (!(model.userAnswerExist(exerciseNr, controller.getUserName()))) {
        model.createUserAnswer(userAnswerField.getText(), getExcercise(), controller.getUserName());
        java.lang.System.out.println("");
    }else {
        model.updateUserAnswer(userAnswerField.getText(), getExcercise(), controller.getUserName());
    }
    btnCheckAllAnswer_setEnabled();
}