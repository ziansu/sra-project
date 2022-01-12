@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    GUI.AddSchoolGUI gui = new GUI.AddSchoolGUI();
    if ((gui.name) != null) {
        Season.School addSchool = new Season.School(gui.name, gui.enrollment, gui.hostStatus);
        allSchools.add(addSchool);
        UpdateComboBox();
    }
    gui.schoolAdder.dispose();
}