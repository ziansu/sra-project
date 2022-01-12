public void setQuantity(java.lang.String quantity) throws com.gracehoppers.jlovas.bookwrm.NegativeNumberException {
    int converted = java.lang.Integer.parseInt(quantity);
    if (converted < 1) {
        throw new com.gracehoppers.jlovas.bookwrm.NegativeNumberException();
    }else {
        this.quantity = converted;
    }
}