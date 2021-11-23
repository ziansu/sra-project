@java.lang.Override
public boolean supports(java.lang.String value) {
    return ((value == null) || (possibleValues.contains(value))) || (supportedValues.contains(value));
}