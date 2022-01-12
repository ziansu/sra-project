@org.junit.Before
public void before() {
    java.lang.String tmpdir = java.lang.System.getProperty("java.io.tmpdir");
    if (!(tmpdir.endsWith(java.io.File.separator)))
        tmpdir += java.io.File.separator;
    
    java.io.File tmpfile = new java.io.File(tmpdir, "MMapTest.data");
    tmpfile.deleteOnExit();
    if (tmpfile.exists())
        tmpfile.delete();
    
    mvstore = new org.h2.mvstore.MVStore.Builder().fileName(tmpfile.getAbsolutePath()).cacheSize(20).open();
}