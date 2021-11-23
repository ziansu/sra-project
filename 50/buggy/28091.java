@java.lang.Override
public org.nd4j.linalg.api.complex.IComplexNumber op(org.nd4j.linalg.api.complex.IComplexNumber origin) {
    if ((origin.absoluteValue().doubleValue()) > (complexNumber.absoluteValue().doubleValue()))
        return origin;
    
    return complexNumber;
}