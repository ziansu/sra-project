private boolean isValid() {
    for (final java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : this.valid.entrySet()) {
        if (!(entry.getValue())) {
            return false;
        }
    }
    return true;
}