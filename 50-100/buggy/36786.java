public java.util.ArrayList<es.icarto.gvsig.navtableforms.ormlite.domainvalues.KeyValue> getValues() {
    java.util.ArrayList<es.icarto.gvsig.navtableforms.ormlite.domainvalues.KeyValue> subset = new java.util.ArrayList<es.icarto.gvsig.navtableforms.ormlite.domainvalues.KeyValue>();
    if (addVoidValue) {
        subset.add(new es.icarto.gvsig.navtableforms.ormlite.domainvalues.KeyValue("", " "));
    }
    subset.addAll(data);
    return data;
}