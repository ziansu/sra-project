@java.lang.Override
public boolean supports(java.lang.String value) {
    return ((value == null) || (possibleValues.contains(value.toLowerCase()))) || (supportedValues.contains(value.toLowerCase()));
}