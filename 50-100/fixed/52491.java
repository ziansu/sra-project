private <T extends com.google.gwt.dev.jjs.ast.HasJsName & com.google.gwt.dev.jjs.HasSourceInfo> void checkJsNamespace(T item) {
    if (com.google.gwt.dev.javac.JsInteropUtil.isGlobal(item.getJsNamespace())) {
        return ;
    }
    if (item.getJsNamespace().isEmpty()) {
        logError(item, "%s cannot have an empty namespace.", getDescription(item));
    }else
        if (!(com.google.gwt.dev.js.JsUtils.isValidJsQualifiedName(item.getJsNamespace()))) {
            logError(item, "%s has invalid namespace '%s'.", getDescription(item), item.getJsNamespace());
        }
    
}