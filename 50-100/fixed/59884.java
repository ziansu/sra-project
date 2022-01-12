public <A extends abs.backend.java.lib.types.ABSValue> java.util.List<A> convert(ABS.StdLib.List<A> absList) {
    java.util.List<A> list = new java.util.ArrayList<A>();
    while (absList.isCons()) {
        ABS.StdLib.List_Cons<A> cons = absList.toCons();
        list.add(cons.getArg0());
        absList = cons.getArg1();
    } 
    return list;
}