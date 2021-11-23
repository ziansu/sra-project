@java.lang.Override
public java.util.List<java.lang.String> getFilenames() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    for (ucar.nc2.grib.collection.PartitionCollectionMutable.Partition p : getPartitions()) {
        if (p.isBad())
            continue;
        
        result.add(p.getIndexFilenameInCache());
    }
    return result;
}