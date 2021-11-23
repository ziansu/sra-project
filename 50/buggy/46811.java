public org.eclipse.titan.runtime.core.TitanBoolean operatorEquals(final org.eclipse.titan.runtime.core.TitanUniversalCharString_Element other_value) {
    mustBound("Unbound left operand of charstring element comparison.");
    other_value.mustBound("Unbound right operand of charstring comparison.");
    return new org.eclipse.titan.runtime.core.TitanBoolean(((get_char()) == (other_value.str_val.charAt(other_value.char_pos))));
}