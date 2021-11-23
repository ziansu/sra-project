@java.lang.Override
public boolean apply(java.lang.Object input) {
    return !(input.getClass().getCanonicalName().equals("groovy.lang.MetaClassImpl"));
}