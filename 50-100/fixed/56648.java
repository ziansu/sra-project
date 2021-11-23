public void setStatus(java.lang.String status) {
    java.lang.String previousStatus = new java.lang.String(this.getStatus());
    this.status = status;
    java.lang.System.out.println(((("Setting window " + (windowNumber)) + " to ") + status));
    setChanged();
    notifyObservers();
}