public boolean isOperationsListChange() {
    if ((operationsListModel.getSize()) != (model.getSelectedOperationBlocks().getOperationSize()))
        return true;
    
    return false;
}