@java.lang.Override
public void put(Key key, Value value) {
    if (!(contains(key))) {
        (size)++;
    }
    table[hash(key)].put(key, value);
}