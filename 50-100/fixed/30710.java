public static java.lang.String getValueType(java.lang.String value) {
    if (java.util.regex.Pattern.matches(IntVariable.VALUE_REGEX, value)) {
        return IntVariable.TYPE;
    }else
        if (java.util.regex.Pattern.matches(DoubleVariable.VALUE_REGEX, value)) {
            return DoubleVariable.TYPE;
        }else
            if (java.util.regex.Pattern.matches(BooleanVariable.VALUE_REGEX, value)) {
                return BooleanVariable.TYPE;
            }else
                if (java.util.regex.Pattern.matches(CharVariable.VALUE_REGEX, value)) {
                    return CharVariable.TYPE;
                }else
                    if (java.util.regex.Pattern.matches(StringVariable.VALUE_REGEX, value)) {
                        return StringVariable.TYPE;
                    }else {
                        return "Null";
                    }
                
            
        
    
}