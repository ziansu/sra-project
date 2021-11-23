public boolean compareToElementSet(hu.progtech.cd2t100.asm.CodeElementSet elementSet) {
    if (!(compareExceptionList(elementSet.getExceptionList()))) {
        return false;
    }
    if (!(instructionList.equals(elementSet.getInstructionList()))) {
        return false;
    }
    if (!(labelMap.equals(elementSet.getLabelMap()))) {
        return false;
    }
    if (!(ruleMap.equals(elementSet.getRuleMap()))) {
        return false;
    }
    return true;
}