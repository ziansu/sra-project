@java.lang.Override
public java.util.ArrayList<?> convertDataToNativeFormat(java.util.List<io.usethesource.vallang.ISet> sampledGraphs) {
    java.util.ArrayList<io.usethesource.capsule.Set.Immutable<io.usethesource.vallang.ITuple>> sampledGraphsNative = new java.util.ArrayList(sampledGraphs.size());
    for (io.usethesource.vallang.ISet graph : sampledGraphs) {
        io.usethesource.capsule.Set.Transient<io.usethesource.vallang.ITuple> convertedValue = io.usethesource.capsule.Set.Transient.of();
        for (io.usethesource.vallang.IValue tuple : graph) {
            convertedValue.__insert(((io.usethesource.vallang.ITuple) (tuple)));
        }
        sampledGraphsNative.add(convertedValue.freeze());
    }
    return sampledGraphsNative;
}