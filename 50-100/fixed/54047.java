public static void main(java.lang.String[] args) {
    com.soartech.soar.ide.core.model.impl.SoarModelTclInterpreter interp = new com.soartech.soar.ide.core.model.impl.SoarModelTclInterpreter(false, new java.util.HashMap<java.lang.String, com.soartech.soar.ide.core.model.impl.ExpandedProductionInfo>(), null);
    try {
        interp.interp.eval("namespace eval Foo { variable x 99 }");
        interp.interp.eval(" puts $Foo::x");
    } catch (tcl.lang.TclException e) {
        java.lang.System.err.println(interp.interp.getResult().toString());
        e.printStackTrace();
    }
}