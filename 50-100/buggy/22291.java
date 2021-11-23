@java.lang.Override
protected java.util.List<java.lang.String> getAvailableItems() {
    java.util.ArrayList<java.lang.String> ret = new java.util.ArrayList<>();
    if ((this.queryAvailableFields) != null) {
        java.lang.String[] raw = this.queryAvailableFields.queryAvailableDatastores();
        if (raw != null) {
            for (java.lang.String ds : raw) {
                ret.add(ds);
            }
        }
    }
    return ret;
}