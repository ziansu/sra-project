@org.junit.Test
public void testParentDirectoryNameIsCorrect() throws java.lang.Exception {
    org.apache.hadoop.hdfs.server.namenode.TestFsLimits.conf.setInt(DFSConfigKeys.DFS_NAMENODE_MAX_COMPONENT_LENGTH_KEY, 20);
    mkdirs("/user", null);
    mkdirs("/user/testHome", null);
    mkdirs("/user/testHome/FileNameLength", null);
    mkdirCheckParentDirectory("/user/testHome/FileNameLength/really_big_name_0003_fail", "/user/testHome/FileNameLength", org.apache.hadoop.hdfs.protocol.FSLimitException.PathComponentTooLongException.class);
    renameCheckParentDirectory("/user/testHome/FileNameLength", "/user/testHome/really_big_name_0003_fail", "/user/testHome/", org.apache.hadoop.hdfs.protocol.FSLimitException.PathComponentTooLongException.class);
}