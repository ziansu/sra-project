@java.lang.Override
public <VS extends uk.ac.ucl.excites.sapelli.storage.model.ValueSet<CS>, CS extends uk.ac.ucl.excites.sapelli.storage.model.ColumnSet> void leave(uk.ac.ucl.excites.sapelli.storage.model.ValueSetColumn<VS, CS> valueSetCol) {
    if ((parentStack.peek()) != valueSetCol)
        throw new java.lang.IllegalStateException("Invalid parent stack state!");
    
    parentStack.pop();
}