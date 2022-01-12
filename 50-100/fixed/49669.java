public static spark.TemplateViewRouteImpl create(java.lang.String path, java.lang.String acceptType, spark.TemplateViewRoute route, spark.TemplateEngine engine) {
    return new spark.TemplateViewRouteImpl(path, acceptType, route) {
        @java.lang.Override
        public java.lang.String render(spark.ModelAndView modelAndView) {
            return engine.render(modelAndView);
        }

        @java.lang.Override
        public java.lang.Object handle(spark.Request request, spark.Response response) throws java.lang.Exception {
            return route.handle(request, response);
        }
    };
}