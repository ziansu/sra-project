@java.lang.Override
public int getKeyGroupIndex(K key) {
    if (key == null) {
        return 0;
    }else {
        int hash = org.apache.flink.util.MathUtils.murmurHash(key.hashCode());
        return (numberKeyGroups) > 0 ? hash % (numberKeyGroups) : hash;
    }
}