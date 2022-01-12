public void setCategories(java.lang.String mainCategory, java.lang.String sub1, java.lang.String sub2, java.lang.String sub3, java.lang.String sub4, java.lang.String sub5) {
    if (mainCategory == null) {
        kategoriPanel1.setVisible(false);
        searchPanel1.setLocation(searchPanel1.getX(), 0);
    }else {
        kategoriPanel1.setVisible(true);
        kategoriPanel1.setCategories(mainCategory, sub1, sub2, sub3, sub4, sub5);
        searchPanel1.setLocation(searchPanel1.getX(), kategoriPanel1.getHeight());
    }
}