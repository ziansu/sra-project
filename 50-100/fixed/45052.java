private java.lang.Object getRenderer(java.lang.Class<?> rendererClass, java.lang.Class<?> valueClass) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    if ((localRenderers) != null)
        for (java.lang.Object o : localRenderers) {
            if (rendererClass.equals(o.getClass())) {
                localRenderers.remove(o);
                return o;
            }
        }
    
    return multiRenderer.getDelegateEditor(valueClass).getClass().newInstance();
}