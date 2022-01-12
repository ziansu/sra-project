public void setInput(int index, boolean value) {
    if ((index > 0) && (index < (inputs.size()))) {
        ((neurality.InputLayer.UserInput) (inputs.get(index))).setValue(value);
    }
}