@java.lang.SuppressWarnings(value = "null")
@java.lang.Override
public T addChange(T change) {
    if (change == null)
        return ((T) (null));
    
    fr.lteconsulting.pomexplorer.change.ChangeProcessing<T>.Item key = new Item(change);
    fr.lteconsulting.pomexplorer.change.ChangeProcessing<T>.Item res = items.get(key);
    if (res != null)
        return res.value;
    
    items.put(key, key);
    return key.value;
}