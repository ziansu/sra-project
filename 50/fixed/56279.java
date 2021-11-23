@java.lang.Override
public com.jantuomi.tunkki.core.parser.datatype.Datatype evaluate(java.util.List<com.jantuomi.tunkki.core.parser.datatype.Datatype> params) throws com.jantuomi.tunkki.exception.types.TunkkiError {
    com.jantuomi.tunkki.core.parser.datatype.Datatype param = params.get(0);
    java.lang.System.out.println(param.toString());
    return new com.jantuomi.tunkki.core.parser.datatype.VoidDatatype();
}