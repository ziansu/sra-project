@java.lang.Override
public gnu.trove.map.TIntObjectMap<it.unibo.alchemist.model.interfaces.GPSTrace> getGPSTraceMapping(final java.lang.String directoryPath) throws java.io.FileNotFoundException, java.io.IOException {
    this.directoryPath = directoryPath;
    mappingPath = readMapping.loadMapping(directoryPath);
    final gnu.trove.map.TIntObjectMap<it.unibo.alchemist.model.interfaces.GPSTrace> mappingTrace = new gnu.trove.map.hash.TIntObjectHashMap<>();
    for (final int key : mappingPath.keys()) {
        mappingTrace.put(key, this.loadGPSTrace(key));
    }
    return null;
}