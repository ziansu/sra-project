private static boolean subtypeOfTypeVar(org.sonar.java.resolve.JavaType arg, org.sonar.java.resolve.JavaType.TypeVariableJavaType formal) {
    for (org.sonar.java.resolve.JavaType bound : formal.bounds()) {
        if ((bound.isTagged(JavaType.TYPEVAR)) && (!(org.sonar.java.resolve.Resolve.subtypeOfTypeVar(arg, ((org.sonar.java.resolve.JavaType.TypeVariableJavaType) (bound)))))) {
            return false;
        }else
            if (!(arg.isSubtypeOf(bound))) {
                return false;
            }
        
    }
    return true;
}