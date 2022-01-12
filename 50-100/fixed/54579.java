@java.lang.Override
public org.apache.lucene.index.PointValues.Relation compare(byte[] minPackedValue, byte[] maxPackedValue) {
    for (int dim = 0; dim < 2; ++dim) {
        if (((org.apache.lucene.util.StringHelper.compare(3, uniquePointValue[dim], 0, maxPackedValue, (dim * 3))) > 0) || ((org.apache.lucene.util.StringHelper.compare(3, uniquePointValue[dim], 0, minPackedValue, (dim * 3))) < 0)) {
            return org.apache.lucene.index.PointValues.Relation.CELL_OUTSIDE_QUERY;
        }
    }
    return org.apache.lucene.index.PointValues.Relation.CELL_CROSSES_QUERY;
}