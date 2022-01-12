java.lang.Long performOperations(Tree<java.lang.Integer> tree, OperationType operation) {
    if (operation == null) {
        return performMixedOperations(tree);
    }else
        if (operation.equals(OperationType.INSERT)) {
            return performInserts(tree);
        }else
            if (operation.equals(OperationType.SEARCH)) {
                return performSearches(tree);
            }else
                if (operation.equals(OperationType.DELETE)) {
                    return performDeletes(tree);
                }
            
        
    
    java.lang.System.out.println("An error occurred.");
    return 0L;
}