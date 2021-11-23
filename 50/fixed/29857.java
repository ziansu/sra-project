public void done(com.parse.ParseObject editProduct, com.parse.ParseException e) {
    if (e == null) {
        editProduct.put("eaten", true);
        editProduct.saveInBackground();
    }
}