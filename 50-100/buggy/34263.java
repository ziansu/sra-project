@java.lang.Override
@java.lang.Deprecated
public boolean canConvert(final java.lang.Class<?> src, final java.lang.reflect.Type dest) {
    if (isArray(dest))
        return true;
    
    if ((dest instanceof java.lang.reflect.ParameterizedType) && (isCollection(dest))) {
        return (createCollection(org.scijava.util.GenericUtils.getClass(dest))) != null;
    }
    return super.canConvert(src, dest);
}