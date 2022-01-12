@java.lang.Override
java.lang.String searchReviews(java.lang.String companyName, java.lang.String keyword) {
    java.lang.String[] attributes = new java.lang.String[]{  };
    java.lang.String result = null;
    try {
        result = dbAccessor.select(keyword.toLowerCase(), companyName.toLowerCase(), java.util.Arrays.asList(attributes));
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException | org.json.JSONException e) {
        e.printStackTrace();
    }
    return result;
}