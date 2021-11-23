public static java.lang.String[] loadArray(android.content.Context context, java.lang.String arrayName, java.lang.String[] defaultValue) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("MakeAnAppointment", Context.MODE_PRIVATE);
    java.lang.String[] array = new java.lang.String[sharedPreferences.getInt((arrayName + "_length"), 0)];
    for (int i = 0; i < (array.length); i++) {
        array[i] = sharedPreferences.getString(((arrayName + "_") + i), null);
    }
    return array;
}