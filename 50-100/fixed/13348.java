@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
@org.codehaus.jackson.map.annotate.JsonDeserialize(using = uk.ac.bbsrc.tgac.miso.core.util.jackson.PooledElementDeserializer.class)
public <T extends uk.ac.bbsrc.tgac.miso.core.data.Poolable> void setPoolableElements(java.util.Collection<T> poolables) {
    if (poolables == null) {
        if ((this.pooledElements) == null) {
            this.pooledElements = java.util.Collections.emptySet();
        }
    }else {
        this.pooledElements = ((java.util.Collection<P>) (poolables));
    }
}