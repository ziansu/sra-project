@org.jetbrains.annotations.Nullable
public static com.intellij.codeInspection.streamMigration.ReduceHandling.ReductionData getReduceVar(com.intellij.codeInspection.streamMigration.PsiLoopStatement loop, com.intellij.codeInspection.streamMigration.StreamApiMigrationInspection.TerminalBlock tb, java.util.List<com.intellij.codeInspection.streamMigration.PsiVariable> variables) {
    com.intellij.codeInspection.streamMigration.PsiAssignmentExpression stmt = tb.getSingleExpression(com.intellij.codeInspection.streamMigration.PsiAssignmentExpression.class);
    if (stmt == null)
        return null;
    
    com.intellij.codeInspection.streamMigration.ReduceHandling.ReductionData data = com.intellij.codeInspection.streamMigration.ReduceHandling.getReductionAccumulator(stmt);
    if ((data == null) || (!(variables.contains(data.getAccumulator()))))
        return null;
    
    return data;
}