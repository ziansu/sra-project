public boolean[] execute(boolean[] input) {
    assert (input.length) == (getNumInputs());
    boolean[] output = new boolean[bdds.size()];
    for (int i = 0; i < (bdds.size()); i++)
        output[i] = bdds.get(i).execute(input);
    
    return output;
}