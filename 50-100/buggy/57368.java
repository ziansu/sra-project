act.route.Router.Node handler(act.route.RequestHandler handler, act.route.RouteSource source) {
    this.routeSource = $.notNull(source);
    this.handler = (handler.requireResolveContext()) ? new act.route.Router.ContextualHandler(((act.route.RequestHandlerBase) (handler))) : handler;
    return this;
}