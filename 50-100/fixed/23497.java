public boolean remove(java.lang.String key) {
    if ((glossary.removeByKey(key)) != null) {
        operations.push(new Model.Operation(Operation.operationType.REMOVE, new Model.Term(key)));
        setTitleToUnsaved();
        return true;
    }else
        return false;
    
}