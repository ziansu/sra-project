public static void setErrorActivityClass(java.lang.Class<? extends android.app.Activity> errorActivityClass) {
    if (errorActivityClass != null) {
        cat.ereza.customactivityoncrash.CustomActivityOnCrash.errorActivityClass = errorActivityClass;
    }else {
        cat.ereza.customactivityoncrash.CustomActivityOnCrash.errorActivityClass = cat.ereza.customactivityoncrash.activity.DefaultErrorActivity.class;
    }
}