protected void add(java.lang.String name, java.lang.String value) {
    if ((formBuilder) == null) {
        formBuilder = new okhttp3.FormBody.Builder();
    }
    if (value != null) {
        formBuilder = formBuilder.add(name, value);
    }
}