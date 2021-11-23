@java.lang.Override
public void endVisit(com.google.gwt.dev.js.ast.JsNameRef x, com.google.gwt.dev.js.ast.JsContext ctx) {
    if ((x.getName()) == (varargParameter.getName())) {
        logError(x, ("Cannot access vararg parameter '%s' from JSNI in JsMethod %s." + " Use 'arguments' instead."), x.getIdent(), getMemberDescription(method));
    }
}