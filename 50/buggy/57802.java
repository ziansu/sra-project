@java.lang.Override
public boolean isKeep(storm.trident.tuple.TridentTuple tridentTuple) {
    java.lang.System.err.println(tridentTuple.getString(0));
    return true;
}