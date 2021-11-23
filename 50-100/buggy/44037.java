public java.lang.String getText(java.lang.Object element) {
    final java.lang.String res;
    final java.lang.Object unwrapped = unwrapp(element);
    if (unwrapped instanceof fr.obeo.dsl.debug.Variable) {
        res = getText(((fr.obeo.dsl.debug.Variable) (unwrapped)).getValue());
    }else
        if (element instanceof fr.obeo.dsl.debug.ide.DSLBreakpoint) {
            res = ((fr.obeo.dsl.debug.ide.DSLBreakpoint) (element)).getText();
        }else {
            res = eLabelProvider.getText(unwrapped);
        }
    
    return res;
}