private void createTableReplLogTask() throws org.apache.hadoop.hive.ql.parse.SemanticException {
    org.apache.hadoop.hive.ql.exec.repl.ReplStateLogWork replLogWork = new org.apache.hadoop.hive.ql.exec.repl.ReplStateLogWork(replLogger, tableDesc.getTableName(), tableDesc.tableType());
    org.apache.hadoop.hive.ql.exec.Task<org.apache.hadoop.hive.ql.exec.repl.ReplStateLogWork> replLogTask = org.apache.hadoop.hive.ql.exec.TaskFactory.get(replLogWork, context.hiveConf);
    if (tracker.tasks().isEmpty()) {
        tracker.addTask(replLogTask);
    }else {
        org.apache.hadoop.hive.ql.exec.repl.bootstrap.ReplLoadTask.dependency(tracker.tasks(), replLogTask);
    }
}