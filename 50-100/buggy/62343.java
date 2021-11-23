public static java.lang.String getNetmaskStringForm(int prefix) throws org.eclipse.kura.KuraException {
    if ((prefix >= 0) && (prefix <= 32)) {
        int mask = ~((1 << (32 - prefix)) - 1);
        return org.eclipse.kura.core.net.util.NetworkUtil.dottedQuad(mask);
    }else {
        throw new org.eclipse.kura.KuraException(org.eclipse.kura.KuraErrorCode.INTERNAL_ERROR, "invalid prefix ");
    }
}