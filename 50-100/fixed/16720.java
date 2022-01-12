private void changeDynamicEventAdapterMessageProperties(java.lang.Object[] eventData, java.util.Map<java.lang.String, java.lang.String> dynamicProperties, java.util.Map<java.lang.String, java.lang.Object> arbitraryDataMap) {
    for (java.lang.String dynamicMessageProperty : dynamicMessagePropertyList) {
        if ((((eventData.length) != 0) || (!(arbitraryDataMap.isEmpty()))) && (dynamicMessageProperty != null)) {
            java.lang.Integer position = propertyPositionMap.get(dynamicMessageProperty);
            changePropertyValue(position, dynamicMessageProperty, eventData, dynamicProperties, arbitraryDataMap);
        }
    }
}