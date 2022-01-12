@java.lang.Override
protected java.lang.annotation.Annotation getMethodLevelBehavior(java.lang.reflect.Method method) {
    if ((behavior) == null) {
        return null;
    }
    return behavior.getBehaviourOfMethod(method);
}