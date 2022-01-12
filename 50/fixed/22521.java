private void setObjectValue(java.lang.Object value) {
    if (value != null) {
        type = value.getClass();
        this.value = value;
    }
}