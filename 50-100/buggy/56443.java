private <T extends com.google.gwt.dev.jjs.ast.HasJsName & com.google.gwt.dev.jjs.HasSourceInfo> void checkJsName(T item) {
    if (item.getJsName().isEmpty()) {
        logError(item, "%s cannot have an empty name.", com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getDescription(item));
    }else
        if (!(com.google.gwt.dev.js.JsUtils.isValidJsIdentifier(item.getJsName()))) {
            logError(item, "%s has invalid name '%s'.", com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getDescription(item), item.getJsName());
        }
    
}