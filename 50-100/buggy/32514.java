@java.lang.Override
public java.lang.Object convert(java.lang.Object source, java.lang.Class<?> expect, java.lang.Class<?>[] extension, com.kepler.generic.reflect.analyse.FieldsAnalyser analyser) throws java.lang.Exception {
    com.kepler.generic.reflect.convert.Getter getter = super.getter(source, extension[0]);
    if ((getter.empty()) && (expect.isAssignableFrom(source.getClass()))) {
        return source;
    }
    return this.convert(analyser, extension, this.collection(expect, getter), getter);
}