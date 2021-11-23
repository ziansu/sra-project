public java.lang.String[] getNames() {
    java.lang.String[] names = new java.lang.String[3];
    for (int i = 0; i < 3; i++) {
        names[i] = this.playerFields[i].getText();
    }
    return this.names;
}