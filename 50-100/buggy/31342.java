public static java.util.List<javax.faces.model.SelectItem> selectItemsForIterator(oracle.adf.model.binding.DCIteratorBinding iter, java.lang.String valueAttrName, java.lang.String displayAttrName) {
    java.util.List<javax.faces.model.SelectItem> selectItems = new java.util.ArrayList<javax.faces.model.SelectItem>();
    for (oracle.jbo.Row r : iter.getAllRowsInRange()) {
        selectItems.add(new javax.faces.model.SelectItem(r.getAttribute(valueAttrName), ((java.lang.String) (r.getAttribute(displayAttrName)))));
    }
    return selectItems;
}