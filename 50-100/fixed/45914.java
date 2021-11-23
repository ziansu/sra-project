public static boolean operator_lessEqualsThan(org.eclipse.smarthome.core.types.Type type, java.lang.Number x) {
    if (((type != null) && (type instanceof org.eclipse.smarthome.core.library.types.DecimalType)) && (x != null)) {
        return (((org.eclipse.smarthome.core.library.types.DecimalType) (type)).toBigDecimal().compareTo(org.eclipse.smarthome.model.script.lib.NumberExtensions.numberToBigDecimal(x))) <= 0;
    }else {
        return false;
    }
}