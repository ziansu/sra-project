public org.lirazs.gbackbone.client.core.collection.Collection set(org.lirazs.gbackbone.client.core.data.Options[] objects, org.lirazs.gbackbone.client.core.data.Options options) {
    java.util.List<T> models = java.util.Arrays.asList();
    for (org.lirazs.gbackbone.client.core.data.Options object : objects) {
        T model = prepareModel(object, options);
        if (model != null) {
            models.add(model);
        }
    }
    return set(models, options);
}