@java.lang.Override
public float getProgress() throws java.io.IOException, java.lang.InterruptedException {
    if ((size) == 0) {
        return 0.0F;
    }
    return ((float) (((org.apache.hadoop.fs.FSDataInputStream) (incoming)).getPos())) / (size);
}