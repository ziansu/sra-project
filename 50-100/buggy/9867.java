public java.lang.String getLabel() {
    if ((!(labelSet)) && (!(localVarLabelSet))) {
        if ((algoParent) == null) {
            return toOutputValueString();
        }else {
            return algoParent.getCommandDescription();
        }
    }else {
        return kernel.printVariableName(label);
    }
}