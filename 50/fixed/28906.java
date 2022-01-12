@java.lang.Override
public int compare(java.io.File file1, java.io.File file2) {
    java.lang.Long time1 = java.lang.Long.valueOf(file1.lastModified());
    java.lang.Long time2 = java.lang.Long.valueOf(file2.lastModified());
    return time1.compareTo(time2);
}