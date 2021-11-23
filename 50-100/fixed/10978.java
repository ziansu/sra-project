private boolean changedMins() {
    try {
        return !((java.lang.Double.parseDouble(this.minutes)) == ((double) (this.time.getValue())));
    } catch (java.lang.Exception e) {
        return false;
    }
}