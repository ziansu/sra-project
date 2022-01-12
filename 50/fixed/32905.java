public static org.eclipse.dltk.ti.types.IEvaluatedType fromString(@org.eclipse.dltk.annotations.Nullable
java.lang.String type) {
    if (type == null) {
        return null;
    }
    return org.eclipse.php.internal.core.typeinference.PHPSimpleTypes.fromStringCS(type.toLowerCase());
}