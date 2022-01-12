public java.lang.String getNextId() {
    while (!(isIdFree(this.nextId))) {
        this.nextId += 1;
    } 
    return java.lang.Integer.toString(this.nextId);
}