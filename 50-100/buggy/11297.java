@java.lang.Override
public src.IR_TYPE_WRAPPER isValid() throws java.lang.Exception {
    type.isValid();
    if (!(size.isValid().equals(new AST.AST_TYPE_TERM(TYPES.INT)))) {
        throw new java.lang.Exception("invalid array size type");
    }
    computedType = new AST.AST_TYPE_ARRAY(type);
    return new src.IR_TYPE_WRAPPER(computedType, null);
}