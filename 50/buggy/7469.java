@java.lang.Override
public boolean apply(@javax.annotation.Nullable
co.cask.cdap.proto.ProgramRecord record) {
    return programType.equals(record.getType().getCategoryName());
}