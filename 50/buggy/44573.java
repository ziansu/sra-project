@java.lang.Override
protected java.lang.annotation.Annotation getMethodLevelBehavior(java.lang.reflect.Method method) {
    return behavior.getBehaviourOfMethod(method);
}