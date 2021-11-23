@java.lang.Override
public boolean execute() {
    if (!(operationParametersSet)) {
        return false;
    }
    for (table.Record record : this.inputData) {
        if (record.containsKey(this.columnName)) {
            if (this.constraintFunction(record.get(this.columnName), this.constraintType, this.constraintValue)) {
                this.resultData.add(record);
            }
        }
    }
    return true;
}