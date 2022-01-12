@java.lang.Override
public boolean isAssignableBy(com.github.javaparser.symbolsolver.model.typesystem.Type other) {
    if (other.isArray()) {
        if ((baseType.isPrimitive()) && (other.asArrayType().getComponentType().isPrimitive())) {
            return baseType.equals(other.asArrayType().getComponentType());
        }
        return baseType.isAssignableBy(other.asArrayType().getComponentType());
    }else {
        if (other.isNull()) {
            return true;
        }
        return false;
    }
}