@java.lang.Override
public T insert(T item) {
    com.firebase.client.Firebase ref = firebase.child(getObjectReference()).push();
    ref.setValue(item);
    item.setId(ref.getKey());
    map.put(ref.getKey(), item);
    return item;
}