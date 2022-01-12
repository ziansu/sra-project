@java.lang.Override
public gov.nasa.jpf.inspector.interfaces.attributes.AttributeConversionResult stringToAttribute(java.lang.String newAttributeValue) {
    if ((((newAttributeValue.length()) < 2) || ((newAttributeValue.charAt(0)) != '"')) || (!(newAttributeValue.endsWith("\"")))) {
        return gov.nasa.jpf.inspector.interfaces.attributes.AttributeConversionResult.failed("The value is not in double quotes.");
    }
    java.lang.String stringContents = newAttributeValue.substring(1, ((newAttributeValue.length()) - 2));
    return gov.nasa.jpf.inspector.interfaces.attributes.AttributeConversionResult.successful(new gov.nasa.jpf.symbc.string.StringConstant(stringContents));
}