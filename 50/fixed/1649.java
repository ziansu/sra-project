public static com.helger.jcodemodel.JDefinedClass intentBuilder(com.helger.jcodemodel.JDefinedClass activity) {
    for (com.helger.jcodemodel.JDefinedClass innerClass : activity.classes()) {
        if (de.nenick.androidannotations.plugin.mvp.utils.GeneratedClasses.isIntentBuilder(innerClass.name())) {
            return innerClass;
        }
    }
    throw new java.lang.IllegalStateException();
}