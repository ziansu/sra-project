public act.route.RequestHandler getInvoker(org.osgl.http.H.Method method, java.lang.CharSequence path, act.app.ActionContext context) {
    context.router(this);
    if (method == (java.lang.reflect.Method.OPTIONS)) {
        return optionHandlerFactory.optionHandler(path, context);
    }
    if ((java.util.Arrays.binarySearch(act.route.Router.targetMethods, method)) < 0) {
        return act.handler.builtin.UnknownHttpMethodHandler.INSTANCE;
    }
    act.route.Router.Node node = search(method, org.osgl.http.util.Path.tokenizer(act.route.Unsafe.bufOf(path)), context);
    return getInvokerFrom(node);
}