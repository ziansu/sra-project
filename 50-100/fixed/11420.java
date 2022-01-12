private org.h2.command.Prepared parseAnalyze() {
    org.h2.command.ddl.Analyze command = new org.h2.command.ddl.Analyze(session);
    if (readIf("TABLE")) {
        org.h2.table.Table table = readTableOrView();
        command.setTable(table);
    }
    if (readIf("SAMPLE_SIZE")) {
        command.setTop(readPositiveInt());
    }
    return command;
}