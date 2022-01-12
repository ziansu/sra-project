public void setQty(int qty, java.lang.Boolean update) {
    if ((qty >= 0) && (qty <= (Constants.MAX_PROD_QTY))) {
        this.qty = qty;
        if (update) {
            this.is_new_qty = true;
            this.vm.is_new = true;
        }
    }else {
        java.lang.System.err.printf("Product %s: Invalid product quantity (%f).\n", name, qty);
        java.lang.System.exit(1);
    }
}