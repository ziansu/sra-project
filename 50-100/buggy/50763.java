public com.wwidesigner.note.FingeringPattern getData() {
    stopTableEditing();
    if ((!(namePopulated)) || (!(fingeringsPopulated))) {
        return null;
    }
    com.wwidesigner.note.FingeringPattern fingerings = new com.wwidesigner.note.FingeringPattern();
    fingerings.setName(nameWidget.getText());
    fingerings.setComment(descriptionWidget.getText());
    fingerings.setNumberOfHoles(java.lang.Integer.parseInt(numberOfHolesWidget.getText()));
    fingerings.setFingering(getTableData());
    return fingerings;
}