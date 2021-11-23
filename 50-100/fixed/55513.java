public void insertIdentifier(symtable.Identifier newIdentifier) {
    if (newIdentifier instanceof symtable.FunctionIdentifier) {
        hashMapList.get(1).put(newIdentifier.getName(), newIdentifier);
    }else {
        hashMapList.peek().put(newIdentifier.getName(), newIdentifier);
    }
}