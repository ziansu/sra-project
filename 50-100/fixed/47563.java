public static java.util.List<java.lang.String> getMapsForMode(java.lang.String mode) {
    java.util.List<java.lang.String> tr = new java.util.ArrayList<java.lang.String>();
    if ((tk.roccodev.zta.autovote.AutovoteUtils.get(mode)) == null)
        return tr;
    
    tr.addAll(((java.util.List<java.lang.String>) (tk.roccodev.zta.autovote.AutovoteUtils.get(mode))));
    return tr;
}