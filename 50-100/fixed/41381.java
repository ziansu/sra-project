@java.lang.Override
public final model.data.Table doProcess() {
    model.data.Table input = getInput();
    codesOnCodeTable();
    if (input == null) {
        throw new java.lang.IllegalStateException("Input is not set");
    }
    if (input instanceof model.data.CombinedDataTable) {
        model.data.CombinedDataTable comb = ((model.data.CombinedDataTable) (input));
        comb.getTables().forEach(this::setCodes);
    }else
        if (input instanceof model.data.DataTable) {
            model.data.DataTable inputTable = ((model.data.DataTable) (input));
            input = setCodes(inputTable);
        }
    
    return input;
}