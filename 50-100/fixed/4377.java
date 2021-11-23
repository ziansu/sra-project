@java.lang.Override
public java.lang.String primitiveValue() {
    if (isPrimitive())
        return value;
    else {
        if ((hasPrimitiveValue()) && ((children) != null)) {
            for (org.hl7.fhir.dstu3.elementmodel.Element c : children) {
                if (c.getName().equals("value"))
                    return c.primitiveValue();
                
            }
        }
        return null;
    }
}