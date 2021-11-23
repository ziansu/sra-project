private void createMenu() {
    javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
    searchField = new javax.swing.JTextField();
    menuBar.add(searchField);
    searchButton = new javax.swing.JButton("Search");
    searchButton.setActionCommand(view.MainFrame.SEARCH);
    menuBar.add(searchButton);
    setJMenuBar(menuBar);
}