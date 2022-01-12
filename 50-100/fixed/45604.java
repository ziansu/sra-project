public java.lang.String toString() {
    java.lang.String result = ca.mcmaster.spccav1_2.Constants.EMPTY_STRING;
    result += " BINode id " + (nodeID);
    for (int index = ca.mcmaster.spccav1_2.Constants.ZERO; index < (branchingInstructionList.size()); index++) {
        result += "\n";
        result += (("Child " + (childList.get(index).nodeID)) + " instructions ") + (branchingInstructionList.get(index));
    }
    return result;
}