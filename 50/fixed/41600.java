@java.lang.Override
public V setValue(V value) {
    V oldValue = this.value;
    this.value = value;
    return oldValue;
}