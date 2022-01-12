public java.util.Locale getCurrentLocale() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.N)) {
        return getResources().getConfiguration().getLocales().get(0);
    }else {
        return getResources().getConfiguration().locale;
    }
}