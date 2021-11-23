public com.adthena.model.inferces.iProduct getProduct(java.lang.String instanceName) {
    switch (instanceName) {
        case "Apple" :
            return new com.adthena.model.Product("Apple", 1.0);
        case "Milk" :
            return new com.adthena.model.Product("Milk", 0.65);
        case "Bread" :
            return new com.adthena.model.Product("Bread", 0.8);
        case "Soup" :
            return new com.adthena.model.Product("Soup", 1.0);
        default :
            break;
    }
    return null;
}