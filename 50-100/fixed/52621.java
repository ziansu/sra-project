public java.lang.Object report(org.nlogo.api.Argument[] args, org.nlogo.api.Context context) throws org.nlogo.api.ExtensionException, org.nlogo.api.LogoException {
    java.lang.String s = args[0].getString();
    org.nlogo.api.LogoListBuilder list = new org.nlogo.api.LogoListBuilder();
    for (char c : s.toCharArray()) {
        list.add(c);
    }
    return list.toLogoList();
}