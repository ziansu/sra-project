@java.lang.Override
public boolean visit(com.google.gwt.dev.jjs.ast.js.JsniMethodBody x, com.google.gwt.dev.jjs.ast.Context ctx) {
    currentJsniMethod = x.getMethod();
    return true;
}