public static crypto.field.Field createField(crypto.polynom.Polynom generatingPolynom) {
    com.google.common.base.Preconditions.checkArgument(generatingPolynom.hasNullpoints(), "generatingPolynom has at least one null point");
    java.util.List<crypto.polynom.Polynom> allElements = crypto.polynom.Polynom.createAllPolynomes(generatingPolynom.getModulo(), generatingPolynom.getVector().getDegree());
    crypto.field.Field field = new crypto.field.Field(allElements, generatingPolynom);
    return field;
}