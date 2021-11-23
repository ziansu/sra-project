private void inputAdvertInfo() {
    exampleAdvert = new Adverts();
    exampleAdvert.nextID(exampleAdvert.getAdvertID());
    exampleAdvert.setTitle(javax.swing.JOptionPane.showInputDialog("Please enter advert title"));
    exampleAdvert.setDescription(javax.swing.JOptionPane.showInputDialog("Please enter advert description"));
    exampleAdvert.setStartDate(javax.swing.JOptionPane.showInputDialog("Please enter advert start date (DD/MM/YY)"));
    exampleAdvert.setEndDate(javax.swing.JOptionPane.showInputDialog("Please enter advert end date (DD/MM/YY)"));
    exampleAdvert.setActive(true);
}