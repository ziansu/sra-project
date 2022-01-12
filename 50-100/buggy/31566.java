public java.lang.String getExtension() {
    java.lang.String result = null;
    if (this.elements.get(((this.lenght) - 1)).contains(".")) {
        java.lang.String temp = this.get(((this.lenght) - 1));
        java.lang.String[] parts = temp.split("\\.");
        result = parts[((parts.length) - 1)];
    }else
        result = "";
    
    return result;
}