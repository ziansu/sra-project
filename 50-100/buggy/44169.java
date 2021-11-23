@java.lang.Override
public void setInput(Jama.Matrix[] input) {
    this.input = input;
    padInput(padding);
    for (int i = 0; i < (filters.length); i++) {
        filters[i] = new Filter(filterSize, input.length);
    }
}