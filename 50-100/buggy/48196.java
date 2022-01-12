public org.eclipse.titan.runtime.core.TitanUniversalCharString assign(org.eclipse.titan.runtime.core.TitanUniversalCharString_Element aOtherValue) {
    aOtherValue.mustBound("Assignment of an unbound universal charstring element to a universal charstring.");
    if (aOtherValue.get_char().is_char()) {
        cstr = new java.lang.StringBuilder(aOtherValue.get_char().getUc_cell());
        val_ptr = null;
        charstring = true;
    }else {
        val_ptr = new java.util.ArrayList<org.eclipse.titan.runtime.core.TitanUniversalChar>();
        val_ptr.add(aOtherValue.get_char());
        cstr = null;
        charstring = false;
    }
    return this;
}