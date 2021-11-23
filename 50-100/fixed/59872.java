private boolean isBEqual(Utilities.Instruction i) {
    if (((bInstruction) != null) && ((i.bInstruction) != null))
        return ((bInstruction) == (i.bInstruction)) || (bInstruction.isDuplicate(i.bInstruction));
    
    if (((bConstant) != null) && ((i.bConstant) != null))
        return bConstant.equals(i.bConstant);
    
    return false;
}