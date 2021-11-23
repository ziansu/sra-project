public static void checkCopy(exm.stc.frontend.Context context, exm.stc.common.lang.Types.Type srctype, exm.stc.common.lang.Types.Type dsttype) throws exm.stc.common.exceptions.TypeMismatchException {
    if (!((srctype.assignableTo(dsttype)) && (srctype.getImplType().equals(dsttype.getImplType())))) {
        new java.lang.Exception().printStackTrace();
        throw new exm.stc.common.exceptions.TypeMismatchException(context, ((("Type mismatch: copying from " + (srctype.toString())) + " to ") + (dsttype.toString())));
    }
}