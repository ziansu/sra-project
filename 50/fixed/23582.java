public boolean isValid() {
    return org.opentravel.schemacompiler.validate.compile.TLModelCompileValidator.validateModelElement(tlObj).isEmpty();
}