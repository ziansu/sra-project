private static void blockInterface() {
    daraujo.faiticchecker.SubjectsGUI.panelLoading.setVisible(true);
    daraujo.faiticchecker.SubjectsGUI.scrollPane.setVisible(false);
    for (java.awt.Component comp : daraujo.faiticchecker.SubjectsGUI.panelOptions.getComponents()) {
        comp.setEnabled(false);
    }
    daraujo.faiticchecker.SubjectsGUI.itemSelectSubjectFolder.setVisible(false);
    daraujo.faiticchecker.SubjectsGUI.btnSearch.setVisible(false);
    daraujo.faiticchecker.SubjectsGUI.panelSearch.setVisible(false);
    daraujo.faiticchecker.SubjectsGUI.btnLogout.setVisible(false);
}