@java.lang.Override
public void setArg(java.lang.String name, java.lang.String value) throws eu.delving.x3ml.X3MLGeneratorPolicy.CustomGeneratorException {
    if (name.startsWith(Labels.TEXT)) {
        this.text = ((((Labels.URN) + ":") + (Labels.UUID)) + ":") + (java.util.UUID.nameUUIDFromBytes(value.getBytes()).toString());
    }else {
        throw new eu.delving.x3ml.X3MLGeneratorPolicy.CustomGeneratorException(("Unrecognized argument name: " + name));
    }
}