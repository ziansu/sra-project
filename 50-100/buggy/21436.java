@java.lang.Override
public java.lang.String generate(org.jboss.errai.codegen.framework.Context context) {
    if ((generatedCache) != null)
        return generatedCache;
    
    generatedCache = (isFinal) ? (Modifier.Final.getCanonicalString()) + " " : "";
    return generatedCache += ((org.jboss.errai.codegen.framework.builder.callstack.LoadClassReference.getClassReference(type, context)) + " ") + (name);
}