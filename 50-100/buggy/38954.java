@java.lang.Override
public java.util.Map.Entry<A, B> next() {
    com.sk89q.worldedit.util.collection.LowMemoryTupleArrayList.Tuple<A, B> result = new com.sk89q.worldedit.util.collection.LowMemoryTupleArrayList.Tuple<A, B>(key.get(index), value.get(index));
    --(index);
    return result;
}