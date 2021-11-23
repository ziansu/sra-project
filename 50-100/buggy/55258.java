private org.cruxframework.crux.core.rebind.screen.widget.ViewFactoryCreator getViewFactoryCreator(org.cruxframework.crux.core.rebind.screen.View view) {
    org.cruxframework.crux.core.rebind.screen.widget.ViewFactoryCreator factory = org.cruxframework.crux.core.rebind.screen.widget.ViewFactoriesProxyCreator.viewFactoryCache.get(view.getId());
    if (factory == null) {
        factory = new org.cruxframework.crux.core.rebind.screen.widget.ViewFactoryCreator(context, view, isChanged(view), getDeviceFeatures());
        org.cruxframework.crux.core.rebind.screen.widget.ViewFactoriesProxyCreator.viewFactoryCache.put(view.getId(), factory);
    }else {
        factory.prepare(context, isChanged(view), getDeviceFeatures());
    }
    return factory;
}