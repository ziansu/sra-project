public java.lang.String getSelectorValue() {
    if ((this.selector.getSelectedIndex()) == 0) {
        return null;
    }else {
        return ((java.lang.String) (this.selector.getSelectedItem()));
    }
}