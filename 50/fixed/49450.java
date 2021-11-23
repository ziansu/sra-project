public static float getDensity(android.content.Context context) {
    org.michaelbel.material.util.Utils.density = context.getResources().getDisplayMetrics().density;
    return org.michaelbel.material.util.Utils.density;
}