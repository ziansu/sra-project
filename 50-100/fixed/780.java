public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int selectedRow = customersTable.getSelectedRow();
    if (selectedRow >= 0) {
        popupFrame.fillInForm("CUSTOMER", customerList.get(selectedRow));
        popupFrame.setVisible(true);
        customerOptionsPopup.setVisible(false);
    }
}