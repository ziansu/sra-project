@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T get(am2.extensions.datamanager.SavedObject<T> data) {
    fillWithNull(data.getId());
    return ((T) (internalData.get(java.lang.Integer.valueOf(data.getId()))));
}