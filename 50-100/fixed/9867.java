public java.lang.String getLabel() {
    if ((!(labelSet)) && (!(localVarLabelSet))) {
        if ((algoParent) == null) {
            return toOutputValueString();
        }
        return algoParent.getCommandDescription();
    }
    return kernel.printVariableName(label);
}