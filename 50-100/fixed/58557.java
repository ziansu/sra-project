private java.util.HashMap<java.lang.String, java.lang.Class> loadBuiltInAdapters() {
    java.util.HashMap<java.lang.String, java.lang.Class> adapters = new java.util.HashMap<>();
    java.util.ServiceLoader<edu.umich.lhs.activator.adapter.EnvironmentAdapter> loader = java.util.ServiceLoader.load(edu.umich.lhs.activator.adapter.EnvironmentAdapter.class);
    for (edu.umich.lhs.activator.adapter.EnvironmentAdapter adapter : loader) {
        for (java.lang.String language : adapter.supports()) {
            adapters.put(language.toUpperCase(), adapter.getClass());
        }
    }
    return adapters;
}