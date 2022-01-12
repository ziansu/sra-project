private static boolean usingLnf(java.lang.String lnfClass) {
    java.lang.String currentLnfClass = javax.swing.UIManager.getLookAndFeel().getClass().getName();
    return currentLnfClass.equals(lnfClass);
}