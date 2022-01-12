public void setEntryValue(final java.lang.String name, final java.lang.String value) {
    if ((this.entriesIndex.get(name)) != null) {
        this.entriesIndex.get(name).setValue(value);
    }else
        if (this.hiddens.containsKey(name)) {
            this.hiddens.removeNode(name);
            this.addHidden(name, value);
        }
    
}