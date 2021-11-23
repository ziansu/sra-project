private boolean checkStaffPermiss(java.util.List<java.lang.String> listPermisson, java.lang.String permisson) {
    boolean checkPermisson = false;
    for (java.lang.String _permisson : listPermisson) {
        if (_permisson.equals(permisson)) {
            checkPermisson = true;
            return checkPermisson;
        }
    }
    return checkPermisson;
}