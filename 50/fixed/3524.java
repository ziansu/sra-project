public static void restoreDensity(android.content.Context context) {
    context.getResources().getDisplayMetrics().setToDefaults();
    android.util.DisplayMetrics metrics = com.bulong.rudeness.RudenessScreenHelper.getMetricsOnMiui(context.getResources());
    if (metrics != null)
        metrics.setToDefaults();
    
}