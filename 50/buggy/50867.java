public static android.view.LayoutInflater getLayoutInflater() {
    if ((com.datdo.mobilib.util.MblUtils.sLayoutInflater) == null) {
        com.datdo.mobilib.util.MblUtils.sLayoutInflater = android.view.LayoutInflater.from(com.datdo.mobilib.util.MblUtils.getCurrentContext());
    }
    return com.datdo.mobilib.util.MblUtils.sLayoutInflater;
}