@java.lang.Override
public boolean findDeserializeAndSet(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt, java.lang.Object bean, java.lang.String key) throws java.io.IOException {
    if (_caseInsensitive) {
        key = key.toLowerCase();
    }
    com.fasterxml.jackson.databind.deser.SettableBeanProperty prop = find(key);
    if (prop != null) {
        try {
            prop.deserializeAndSet(p, ctxt, bean);
        } catch (java.lang.Exception e) {
            wrapAndThrow(e, bean, key, ctxt);
        }
        return true;
    }
    return false;
}