private cucumber.runtime.RuntimeOptions createRuntimeOptions(final android.content.Context context) {
    for (final java.lang.Class<?> clazz : classFinder.getDescendants(java.lang.Object.class, context.getPackageName())) {
        if (clazz.isAnnotationPresent(cucumber.api.CucumberOptions.class)) {
            android.util.Log.d(cucumber.runtime.android.CucumberExecutor.TAG, ("Found CucumberOptions in class " + (clazz.getName())));
            final cucumber.runtime.RuntimeOptionsFactory factory = new cucumber.runtime.RuntimeOptionsFactory(clazz);
            return factory.create();
        }
    }
    throw new cucumber.runtime.CucumberException("No CucumberOptions annotation");
}