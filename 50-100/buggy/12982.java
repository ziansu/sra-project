public org.eclipse.titan.runtime.core.TitanBoolean operatorEquals(final org.eclipse.titan.runtime.core.TitanUniversalCharString other_value) {
    mustBound("Unbound left operand of charstring element comparison.");
    other_value.mustBound("Unbound right operand of charstring element comparison.");
    if ((other_value.getValue().size()) != 1) {
        return new org.eclipse.titan.runtime.core.TitanBoolean(false);
    }
    return new org.eclipse.titan.runtime.core.TitanBoolean(((get_char()) == (other_value.charAt(0))));
}