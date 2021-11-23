@java.lang.Override
public void getSplits() throws java.io.IOException, java.lang.InterruptedException {
    splits = new java.util.ArrayList<com.rasp.interfaces.InputSplit>();
    long l = blockSize(workerCount);
    for (int i = 0; i < (workerCount); i++) {
        splits.add(new com.rasp.interfaces.com.rasp.fs.InputSplit(offset(l, i), l, ""));
    }
}