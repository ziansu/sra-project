public int getDPI(int size) {
    android.util.DisplayMetrics metrics;
    metrics = new android.util.DisplayMetrics();
    if ((getActivity()) == null) {
        java.lang.System.out.println("null");
    }
    a.getWindowManager().getDefaultDisplay().getMetrics(metrics);
    return (size * (metrics.densityDpi)) / (android.util.DisplayMetrics.DENSITY_DEFAULT);
}