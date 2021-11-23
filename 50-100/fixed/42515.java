public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("Character Creation")) {
        java.lang.String[] a = new java.lang.String[]{ "" };
        COCreationGUI co_window = new COCreationGUI(validUser);
    }else
        if (e.getActionCommand().equals("Map Creation")) {
            PreMadeMaps maps_window = new PreMadeMaps("testfilemap2.txt");
        }
    
}