public org.voltdb.VoltTable[] run(int uid) {
    voltQueueSQL(getFollowing, uid);
    org.voltdb.VoltTable[] result = voltExecuteSQL();
    int num_params = java.lang.Math.min(result[0].getRowCount(), TwitterConstants.LIMIT_FOLLOWERS);
    for (int i = 0; i < num_params; ++i) {
        voltQueueSQL(getTweets, result[0].fetchRow(i).getLong(0));
    }
    if (num_params > 0) {
        return voltExecuteSQL(true);
    }
    return null;
}