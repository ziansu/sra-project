public <A extends abs.backend.java.lib.types.ABSValue> java.util.Set<A> convert(ABS.StdLib.Set<A> absSet) {
    java.util.Set<A> set = new java.util.HashSet<A>();
    if (absSet.isInsert()) {
        ABS.StdLib.Set_Insert<A> insert = absSet.toInsert();
        set.add(insert.getArg0());
        set.addAll(convert(insert.getArg1()));
    }
    return set;
}