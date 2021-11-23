@java.lang.Override
public void createFromPoints(edu.umn.cs.spatialHadoop.core.Rectangle mbr, edu.umn.cs.spatialHadoop.core.Point[] points, int numPartitions) {
    this.mbr.set(mbr);
    int[] hValues = new int[points.length];
    for (int i = 0; i < (points.length); i++)
        hValues[i] = edu.umn.cs.spatialHadoop.core.HilbertCurvePartitioner.computeHValue(mbr, points[i].x, points[i].y);
    
    createFromHValues(hValues, numPartitions);
}