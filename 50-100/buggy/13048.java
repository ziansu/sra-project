public java.lang.String convertFromArabicToRomanNumeral(java.lang.Integer inputNumber) {
    java.lang.StringBuilder romanNumeral = new java.lang.StringBuilder();
    while (inputNumber != 0) {
        for (java.util.Map.Entry<java.lang.Integer, java.lang.String> numeralMapEntry : RomanNumeralConverter.numeralMap.entrySet()) {
            java.lang.Integer numeralSegmentArabicValue = numeralMapEntry.getKey();
            java.lang.String numeralSegment = numeralMapEntry.getValue();
            if (inputNumber >= numeralSegmentArabicValue) {
                inputNumber -= numeralSegmentArabicValue;
                romanNumeral.append(numeralSegment);
            }
        }
    } 
    return romanNumeral.toString();
}