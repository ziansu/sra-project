protected void updateNextIdForId(java.lang.String id) {
    try {
        int idAsInt = java.lang.Integer.parseInt(id);
        this.updateNextIdForId(idAsInt);
    } catch (java.lang.Exception ignored) {
    }
}