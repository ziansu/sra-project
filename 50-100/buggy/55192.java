@java.lang.Override
public java.lang.Object report(org.nlogo.api.Argument[] args, org.nlogo.api.Context context) throws org.nlogo.api.ExtensionException, org.nlogo.api.LogoException {
    java.lang.String str = args[0].getString();
    if (!(Bitstring.is10(str))) {
        throw new org.nlogo.api.ExtensionException((("String \"" + str) + "\" contains one or more characters not interpretable as 1 or 0"));
    }
    return new NetLogoBitstring(str);
}