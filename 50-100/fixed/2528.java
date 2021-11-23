public int getProductPrice(java.lang.String barcode) {
    java.lang.String query = ("select unit_price from inventory where barcode = '" + barcode) + "'";
    java.util.ArrayList<java.util.ArrayList<java.lang.String>> outer = new java.util.ArrayList<java.util.ArrayList<java.lang.String>>();
    java.util.ArrayList<java.lang.String> inner = new java.util.ArrayList<java.lang.String>();
    outer = db.newQuery(query, 1);
    inner = outer.get(0);
    return java.lang.Integer.parseInt(inner.get(0));
}