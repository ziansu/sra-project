public org.eclipse.titan.runtime.core.TitanUniversalCharString concatenate(final org.eclipse.titan.runtime.core.TitanUniversalCharString_Element other_value) {
    mustBound("The left operand of concatenation is an unbound universal charstring value.");
    other_value.mustBound("The right operand of concatenation is an unbound universal charstring element.");
    if (charstring) {
        return new org.eclipse.titan.runtime.core.TitanUniversalCharString(new java.lang.StringBuilder(cstr).append(other_value.get_char().getUc_cell()));
    }
    final org.eclipse.titan.runtime.core.TitanUniversalCharString ret_val = new org.eclipse.titan.runtime.core.TitanUniversalCharString(val_ptr);
    ret_val.val_ptr.add(other_value.get_char());
    return ret_val;
}