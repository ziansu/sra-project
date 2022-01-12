private edu.umass.ckc.wo.content.PrePostProblemDefn getPrePostProblemN(java.sql.Connection connection, int pretestId, int position) throws java.sql.SQLException {
    edu.umass.ckc.wo.content.PrePostProblemDefn p = edu.umass.ckc.wo.db.DbPrePost.getPrePosttestProblem(connection, pretestId, (position - 1));
    return p;
}