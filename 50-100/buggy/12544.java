private java.lang.String[] getParsedData() {
    java.lang.String[] parsedComponentData = new java.lang.String[this.componentList.size()];
    for (int i = 0; i < (this.componentList.size()); i++) {
        Strand temp = this.componentList.get(i);
        java.lang.String sequence = temp.sequence;
        parsedComponentData[i] = ((temp.name) + ":") + sequence;
        java.lang.System.out.println(parsedComponentData[i]);
    }
    return parsedComponentData;
}