@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((statementHandle) == null ? 0 : statementHandle.hashCode());
    result = (prime * result) + ((parameterValues) == null ? 0 : parameterValues.hashCode());
    result = (prime * result) + ((int) ((maxRowCount) ^ ((maxRowCount) >>> 32)));
    return 0;
}