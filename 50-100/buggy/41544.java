public static int scanTypeSignature(char[] string, int start) {
    if (start >= (string.length)) {
        throw new java.lang.IllegalArgumentException();
    }
    char c = string[start];
    switch (c) {
        case org.eclipse.wst.jsdt.core.Signature.C_ARRAY :
            return org.eclipse.wst.jsdt.internal.core.util.Util.scanArrayTypeSignature(string, start);
        case org.eclipse.wst.jsdt.core.Signature.C_RESOLVED :
        case org.eclipse.wst.jsdt.core.Signature.C_UNRESOLVED :
            return org.eclipse.wst.jsdt.internal.core.util.Util.scanClassTypeSignature(string, start);
        case org.eclipse.wst.jsdt.core.Signature.C_VOID :
        case org.eclipse.wst.jsdt.core.Signature.C_ANY :
            return org.eclipse.wst.jsdt.internal.core.util.Util.scanBaseTypeSignature(string, start);
        default :
            throw new java.lang.IllegalArgumentException();
    }
}