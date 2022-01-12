public java.lang.String ReadFile(java.util.List<java.lang.Integer> sectors) throws java.io.IOException {
    java.lang.String ret = "";
    for (int i = 0; i < (sectors.size()); i++) {
        ret = ret.concat(disk.readSector(i));
    }
    return ret;
}