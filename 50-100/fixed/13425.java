public int getMainFunctionsCount() {
    int count = 0;
    if ((this.methods) == null) {
        return 0;
    }
    for (int i = 0; i < (this.methods.size()); i++) {
        if (this.methods.get(i).isMain()) {
            count++;
        }
    }
    return count;
}