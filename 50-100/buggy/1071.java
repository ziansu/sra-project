@java.lang.Override
protected void decodeBody(org.apache.kerby.asn1.LimitedByteBuffer content) throws java.io.IOException {
    while (content.available()) {
        org.apache.kerby.asn1.type.Asn1Type aValue = decodeOne(content);
        if (aValue != null) {
            if (aValue instanceof org.apache.kerby.asn1.type.Asn1Item) {
                addItem(((org.apache.kerby.asn1.type.Asn1Item) (aValue)));
            }else {
                addItem(aValue);
            }
        }else {
            throw new java.lang.RuntimeException("Unexpected running into here");
        }
    } 
}