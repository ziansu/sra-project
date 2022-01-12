void process(javax.lang.model.element.Element element, org.androidannotations.holder.EComponentWithViewSupportHolder holder) throws com.helger.jcodemodel.JClassAlreadyExistsException {
    java.lang.String activityName = readGeneratedActivityToLaunch(de.nenick.androidannotations.plugin.mvp.utils.JTypeArguments.genericTypeArgument(element));
    com.helger.jcodemodel.JDefinedClass activityToLaunch = de.nenick.androidannotations.plugin.mvp.utils.GeneratedClasses.generatedActivityOrFragment(activityName, base);
    com.helger.jcodemodel.JDefinedClass intentBuilderClass = de.nenick.androidannotations.plugin.mvp.utils.GeneratedClasses.intentBuilder(activityToLaunch);
    buildActivityLauncherClass(element, holder.getGeneratedClass(), activityToLaunch, intentBuilderClass);
}