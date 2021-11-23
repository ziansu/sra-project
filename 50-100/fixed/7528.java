private static void noEL(java.lang.String nm, java.lang.String val, org.zkoss.idom.Item item) throws org.zkoss.zk.ui.UiException {
    if ((val != null) && (val.contains("${")))
        throw new org.zkoss.zk.ui.UiException(org.zkoss.zk.ui.metainfo.Parser.message((nm + " does not support EL expressions"), item));
    
}