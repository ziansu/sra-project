@java.lang.Override
public boolean isKeep(storm.trident.tuple.TridentTuple tridentTuple) {
    java.lang.System.err.println(tridentTuple.get(0).toString());
    return true;
}