private void attachOriginalApplication() throws java.lang.Exception {
    revertAll();
    java.lang.Class acd = getClassLoader().loadClass("me.ele.amigo.acd");
    java.lang.String applicationName = ((java.lang.String) (me.ele.amigo.reflect.FieldUtils.readStaticField(acd, "n")));
    realApplication = ((android.app.Application) (getClassLoader().loadClass(applicationName).newInstance()));
    me.ele.amigo.reflect.MethodUtils.invokeMethod(realApplication, "attach", getBaseContext());
}