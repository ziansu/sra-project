@java.lang.Override
public void createFromPoints(edu.umn.cs.spatialHadoop.core.Rectangle mbr, edu.umn.cs.spatialHadoop.core.Point[] points, int numPartitions) {
    this.mbr = mbr.clone();
    long[] zValues = new long[points.length];
    for (int i = 0; i < (points.length); i++)
        zValues[i] = edu.umn.cs.spatialHadoop.core.ZCurvePartitioner.computeZ(mbr, points[i].x, points[i].y);
    
    createFromZValues(zValues, numPartitions);
}