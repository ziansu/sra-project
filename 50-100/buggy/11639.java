@java.lang.Override
protected T create() {
    java.lang.String subType = getPropertyValue(com.oculusinfo.factory.UberFactory.FACTORY_TYPE);
    try {
        return produce(subType, com.oculusinfo.factory.UberFactory.getFactoryType());
    } catch (com.oculusinfo.factory.ConfigurationException e) {
        com.oculusinfo.factory.UberFactory.LOGGER.warn("Error creating product {}[{}] for {}", new java.lang.Object[]{ com.oculusinfo.factory.UberFactory.getFactoryType() , com.oculusinfo.factory.UberFactory.getName() , subType });
        return null;
    }
}