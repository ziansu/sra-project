public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int selectedRow = customersTable.getSelectedRow();
    if (selectedRow >= 0) {
        popupFrame.fillInForm("CUSTOMER", ((com.jasonandrews.projects.businessmanager.Customer) (customerList.get(selectedRow))).getCustomerInformation());
    }
    popupFrame.setVisible(true);
    customerOptionsPopup.setVisible(false);
}