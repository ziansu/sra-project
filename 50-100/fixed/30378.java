private void setRunApp(java.lang.String packageName) {
    int position = 0;
    org.ftcollinsresearch.shutdowntimer.PInfo pi;
    if (packageName != null) {
        for (java.lang.Object obj : _PInfos) {
            pi = ((org.ftcollinsresearch.shutdowntimer.PInfo) (obj));
            if (pi.pname.equalsIgnoreCase(packageName)) {
                position = _appAdapter.getPosition(pi);
                break;
            }
        }
    }
    _spnApp.setSelection(position);
}