public void postConcatonateInputs(int numInputsToAdd) {
    modifyNodeInputIndex(0, numInputsToAdd);
    if ((nodes.size()) > 1)
        modifyNodeInputIndex(1, numInputsToAdd);
    
    this.numInputs += numInputsToAdd;
}