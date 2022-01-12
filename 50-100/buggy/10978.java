private boolean changedMins() {
    try {
        return !((java.lang.Double.parseDouble(this.minutes)) == (java.lang.Double.parseDouble(this.time.getEditor().getText())));
    } catch (java.lang.Exception e) {
        return false;
    }
}