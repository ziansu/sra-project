private void getAndAmendInfo() {
    if ((exampleAdvert.getIsActive()) == true) {
        exampleAdvert.setTitle(javax.swing.JOptionPane.showInputDialog("Please enter amended advert title"));
        exampleAdvert.setDescription(javax.swing.JOptionPane.showInputDialog("Please enter amended advert description"));
        exampleAdvert.setStartDate(javax.swing.JOptionPane.showInputDialog("Please enter amended advert start date (DD/MM/YY)"));
        exampleAdvert.setEndDate(javax.swing.JOptionPane.showInputDialog("Please enter amended advert end date (DD/MM/YY)"));
        java.lang.System.exit(0);
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "No advert to amend", "No Advert", javax.swing.JOptionPane.ERROR_MESSAGE);
        java.lang.System.exit(0);
    }
}