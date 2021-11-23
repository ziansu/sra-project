private void createMenu() {
    javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
    javax.swing.JMenu arkiv = new javax.swing.JMenu("Arkiv");
    javax.swing.JMenuItem menuItem = new javax.swing.JMenuItem("Exit");
    arkiv.add(menuItem);
    menuBar.add(arkiv);
    searchField = new javax.swing.JTextField();
    menuBar.add(searchField);
    searchButton = new javax.swing.JButton("Search");
    searchButton.setActionCommand(view.MainFrame.SEARCH);
    menuBar.add(searchButton);
    setJMenuBar(menuBar);
}