private javax.swing.JComponent makeTextPanel(java.lang.String type) {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    if (type.equalsIgnoreCase("View")) {
        panel.add(new gui.ViewGUI());
    }else
        if (type.equalsIgnoreCase("Add Alumni")) {
            panel.add(new gui.AlumniAddGUI());
        }else
            if ("Report".equalsIgnoreCase(type)) {
                panel.add(new gui.ReportGUI());
            }
        
    
    return panel;
}