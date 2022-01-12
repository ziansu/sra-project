@java.lang.Override
public int compare(org.apache.hadoop.fs.FileStatus o1, org.apache.hadoop.fs.FileStatus o2) {
    return ((int) ((o2.getModificationTime()) - (o1.getModificationTime())));
}