@java.lang.Override
public org.apache.tamaya.spi.PropertyValue evaluteRawValue(java.lang.String key, org.apache.tamaya.spi.ConfigurationContext context) {
    org.apache.tamaya.spi.PropertyValue unfilteredValue = null;
    for (org.apache.tamaya.spi.PropertySource propertySource : context.getPropertySources()) {
        unfilteredValue = context.getPropertyValueCombinationPolicy().collect(unfilteredValue, key, propertySource);
    }
    if ((unfilteredValue == null) || ((unfilteredValue.getValue()) == null)) {
        return null;
    }
    return unfilteredValue;
}