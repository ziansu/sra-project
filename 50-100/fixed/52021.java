public boolean isSubtypeOfBound(org.sonar.java.resolve.JavaType type) {
    switch (boundType) {
        case SUPER :
            return bound.isSubtypeOf(type);
        case EXTENDS :
            return (!(boundIsTypeVarAndNotType(type))) && (type.isSubtypeOf(bound));
        case UNBOUNDED :
        default :
            return true;
    }
}