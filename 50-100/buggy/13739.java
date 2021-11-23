public void loadFromEntityRefs(java.util.List<com.googlecode.objectify.Ref<V>> refs) {
    if (null != refs) {
        allocateMap();
        this.entityMap.clear();
        for (com.googlecode.objectify.Ref<V> ref : refs) {
            if (null == ref) {
                continue;
            }
            V entity = ref.get();
            this.entityMap.put(this.keyGen.keyFor(entity), entity);
        }
    }
    throw new org.apache.commons.lang3.NotImplementedException("Not yet implemented.");
}