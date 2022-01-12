@javax.annotation.Nonnull
public com.helger.jcodemodel.AbstractJClass narrow(@javax.annotation.Nonnull
final com.helger.jcodemodel.AbstractJClass... clazz) {
    if ((clazz.length) == 0)
        return this;
    
    return new com.helger.jcodemodel.JNarrowedClass(this, java.util.Arrays.asList(clazz.clone()));
}