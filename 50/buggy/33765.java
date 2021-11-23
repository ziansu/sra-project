public void configHandler(com.demo.common.Handlers me) {
    me.add(new com.demo.common.StaticResourceHandler());
    me.add(new com.jfinal.ext.handler.ContextPathHandler("ctx"));
}