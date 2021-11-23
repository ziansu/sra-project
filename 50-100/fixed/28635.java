@java.lang.Override
public double valueAsciiOovDeletion(uk.ac.cam.eng.extraction.datatypes.Rule r, org.apache.hadoop.io.ArrayWritable mapReduceFeatures) {
    if (((r.getTargetWords().size()) == 1) && ((r.getTargetWords().get(0)) == 0)) {
        return -1;
    }
    if ((r.getTargetWords().size()) == 0) {
        return -1;
    }
    return 0;
}