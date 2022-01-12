private java.util.Iterator<org.openrdf.query.BindingSet> getCrossProducts(org.openrdf.query.BindingSet bs) {
    java.util.Set<org.openrdf.query.BindingSet> crossProducts = new java.util.HashSet<org.openrdf.query.BindingSet>();
    for (org.openrdf.query.BindingSet bSet : crossProductBs) {
        org.openrdf.query.BindingSet prod = takeCrossProduct(bs, bSet);
        if (prod != (EMPTY_BINDINGSET)) {
            crossProducts.add(prod);
        }
    }
    return crossProducts.iterator();
}