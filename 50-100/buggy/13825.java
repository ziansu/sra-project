private java.lang.String getInputs() {
    java.lang.String triple = new java.lang.String("");
    for (int i = 0; i < (this.inputs.length()); i++) {
        org.json.JSONObject jsonObject = rdfbones.lib.JSON.stringArr(this.inputs, i);
        triple += ((("<" + (input)) + ">   obo:OBI_0000293 <") + (this.dataTransformation)) + "> .\n";
    }
    return triple;
}