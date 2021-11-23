private java.util.LinkedList<org.bson.Document> changeOrderProduct(java.util.LinkedList<org.bson.Document> productlist) {
    java.lang.String s = "Select the one you want to change:\n";
    for (int i = 0; i < (productlist.size()); i++) {
        s += ((i + " : ") + (productlist.get(i).get("name"))) + "\n";
    }
    int index = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog(s));
    productlist.set(index, productPick());
    return productlist;
}