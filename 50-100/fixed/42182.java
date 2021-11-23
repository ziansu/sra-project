private java.lang.String getInputs() {
    java.lang.String triple = new java.lang.String("");
    for (int i = 0; i < (this.inputs.length()); i++) {
        java.lang.String input = rdfbones.lib.JSON.stringArr(this.inputs, i);
        triple += ((("<" + (dataTransformation)) + ">   obo:OBI_0000293 <") + input) + "> .\n";
    }
    return triple;
}