private java.lang.String generateId() {
    int max = 999999;
    int min = 100000;
    java.lang.String id = java.lang.Integer.toString(((int) (java.lang.Math.round((((java.lang.Math.random()) * ((max - min) + 1)) + min)))));
    synchronized(this.commandIds) {
        id = ((this.commandIds.get(id)) != null) ? generateId() : id;
    }
    return id;
}