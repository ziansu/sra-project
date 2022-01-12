public org.eclipse.titan.runtime.core.TitanUniversalCharString assign(org.eclipse.titan.runtime.core.TitanUniversalChar aOtherValue) {
    cleanUp();
    if (aOtherValue.is_char()) {
        charstring = true;
        cstr = new java.lang.StringBuilder(aOtherValue.getUc_cell());
    }else {
        charstring = false;
        val_ptr = new java.util.ArrayList<org.eclipse.titan.runtime.core.TitanUniversalChar>();
        val_ptr.add(aOtherValue);
    }
    return this;
}