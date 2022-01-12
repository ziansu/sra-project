public org.eclipse.titan.runtime.core.TitanHexString add(final org.eclipse.titan.runtime.core.TitanHexString_Element otherValue) {
    mustBound("Unbound left operand of hexstring concatenation.");
    otherValue.mustBound("Unbound right operand of hexstring element concatenation.");
    org.eclipse.titan.runtime.core.TitanHexString result = new org.eclipse.titan.runtime.core.TitanHexString(nibbles_ptr);
    result.nibbles_ptr.add(((byte) (otherValue.get_nibble())));
    return result;
}