@java.lang.Override
protected void changeView() {
    super.changeView();
    if ((setType.equals("SetOfVolumes")) || (setType.equals("SetOfClasses3D"))) {
        if ((cmdbutton) != null) {
            cmdbutton.setVisible(data.isTableMode());
            createvolbt.setVisible((!(data.isTableMode())));
        }
    }
}