public static java.lang.Long[] loadArray(android.content.Context context, java.lang.String arrayName, java.lang.Long[] defaultValue) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("MakeAnAppointment", Context.MODE_PRIVATE);
    java.lang.Long[] array = new java.lang.Long[sharedPreferences.getInt((arrayName + "_length"), 0)];
    for (int i = 0; i < (array.length); i++) {
        sharedPreferences.getLong(((arrayName + "_") + i), 0);
    }
    return array;
}