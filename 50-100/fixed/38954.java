@java.lang.Override
public java.util.Map.Entry<A, B> next() {
    com.sk89q.worldedit.util.collection.LowMemoryTupleArrayList.Tuple<A, B> result = new com.sk89q.worldedit.util.collection.LowMemoryTupleArrayList.Tuple<A, B>(key.get(((index) - 1)), value.get(((index) - 1)));
    --(index);
    return result;
}