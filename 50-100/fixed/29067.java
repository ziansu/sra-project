public static java.lang.String getName(int id, android.content.Context context) {
    if (context != null) {
        int[] sourceIds = context.getResources().getIntArray(R.array.currency_sources_ids);
        java.lang.String[] sourceNames = context.getResources().getStringArray(R.array.currency_sources);
        for (int i = 0; i < (sourceIds.length); i++) {
            if ((sourceIds[i]) == id) {
                return sourceNames[i];
            }
        }
    }
    return "";
}