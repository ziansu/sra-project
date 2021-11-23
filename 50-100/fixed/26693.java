static org.erights.e.elib.vat.Runner getDefault() {
    synchronized(org.erights.e.ui.swt.SWTRunner.OUR_LOCK) {
        if (null == (org.erights.e.ui.swt.SWTRunner.THE_DEFAULT)) {
            org.eclipse.swt.internal.Library.loadLibrary("swt");
            org.erights.e.ui.swt.SWTRunner.THE_DEFAULT = new org.erights.e.ui.swt.SWTRunner();
            java.lang.System.setProperty("e.swtVersion", ("" + (org.eclipse.swt.SWT.getVersion())));
            java.lang.System.setProperty("e.swtPlatform", org.eclipse.swt.SWT.getPlatform());
        }
        return org.erights.e.ui.swt.SWTRunner.THE_DEFAULT;
    }
}