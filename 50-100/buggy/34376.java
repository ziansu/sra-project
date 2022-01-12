public java.lang.String buy() {
    java.util.List<java.lang.Integer> pId = new java.util.ArrayList<>();
    java.util.List<java.lang.Integer> pQty = new java.util.ArrayList<>();
    for (com.cookiebutter.Data.Product s : selectedProducts) {
        pId.add(s.getId());
        pQty.add(s.getQuantity());
    }
    com.cookiebutter.Data.Transaction trans = new com.cookiebutter.Data.Transaction(pId, pQty);
    transactionService.add(trans);
    productService.reduceAvailableProducts();
    return "availableProducts?faces-redirect=true";
}