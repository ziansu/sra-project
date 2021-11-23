private void onInitContext() {
    platformBeanRepository = new com.canoo.dolphin.server.impl.ServerPlatformBeanRepository(dolphin, beanRepository, dispatcher, converters);
}