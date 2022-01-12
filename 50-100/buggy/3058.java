private boolean isValidVrstaKnjige() {
    if ((vrstaKnjige) == null) {
        java.lang.String vk = txtVrstaKnjige.getText();
        if (vrstaKnjigeServiceBean.existsVrstaKnjige(vk)) {
            message = "The entered book type already exists!";
            return false;
        }
        if ((vk.equals(null)) || (vk.equals(""))) {
            txtVrstaKnjige.setBackground(java.awt.Color.LIGHT_GRAY);
            message = "Book type title is missing!";
            return false;
        }
    }
    return true;
}