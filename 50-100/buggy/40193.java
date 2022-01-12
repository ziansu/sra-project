public void removeProperty(Property property) {
    Property[] arr = new Property[(properties.length) - 1];
    int j = 0;
    for (int i = 0; i < (properties.length); i++) {
        if (property != (properties[i])) {
            arr[j] = properties[i];
            j++;
        }
    }
    properties = arr;
}