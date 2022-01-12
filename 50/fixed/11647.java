@java.lang.Override
public void autowire(java.lang.Object sourceFromContainer) {
    java.lang.String s = org.mentacontainer.util.InjectionUtils.getKeyName(sourceFromContainer);
    autowireBySetter(s, s);
    autowireByConstructor(s);
}