public void setEntryValue(final java.lang.String name, final java.lang.String value) {
    if ((entriesIndex.get(name)) != null) {
        entriesIndex.get(name).setValue(value);
    }else
        if (hiddens.containsKey(name)) {
            hiddens.removeNode(name);
            this.addHidden(name, value);
        }
    
}