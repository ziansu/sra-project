@java.lang.Override
public java.lang.Object convert(java.lang.Object source, java.lang.Class<?> expect, java.lang.Class<?>[] extension, com.kepler.generic.reflect.analyse.FieldsAnalyser analyser) throws java.lang.Exception {
    if (source.getClass().equals(expect)) {
        return source;
    }
    return this.convert(analyser, extension, super.getter(source));
}