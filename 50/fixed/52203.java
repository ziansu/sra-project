public org.eclipse.titan.runtime.core.TitanHexString append(final org.eclipse.titan.runtime.core.TitanHexString otherValue) {
    mustBound("Unbound left operand of hexstring concatenation.");
    otherValue.mustBound("Unbound right operand of hexstring concatenation.");
    org.eclipse.titan.runtime.core.TitanHexString result = new org.eclipse.titan.runtime.core.TitanHexString(nibbles_ptr);
    result.nibbles_ptr.addAll(copyList(otherValue.nibbles_ptr));
    return result;
}