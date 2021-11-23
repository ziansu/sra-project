private java.util.ArrayList<java.lang.String> getRawResourcesNames() {
    java.util.ArrayList<java.lang.String> rawResourcesNames = new java.util.ArrayList<>();
    final java.lang.reflect.Field[] fields = R.raw.class.getDeclaredFields();
    for (java.lang.reflect.Field field : fields) {
        final java.lang.String resourceName;
        resourceName = field.getName();
        if ((getApplicationContext().getResources().getIdentifier(resourceName, "raw", "com.example.user1.absolute")) != 0)
            rawResourcesNames.add(resourceName);
        
    }
    return rawResourcesNames;
}