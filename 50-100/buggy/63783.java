private ExamType.GUI.ExamType selectExamType() {
    cancelUpdate.setVisible(true);
    int index = examTypeList.getSelectedIndex();
    if (index == (-1)) {
        updateStatus("Error: Select an Exam Type from the list");
        addNewETButton.setEnabled(false);
        return nullExamType;
    }
    return ExamType.GUI.GUIController.getExamType(index);
}