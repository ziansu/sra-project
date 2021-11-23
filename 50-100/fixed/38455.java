@java.lang.Override
public boolean[] execute(boolean[] input) {
    assert (input.length) == (getNumInputs());
    boolean[] output = new boolean[bdds.size()];
    for (int i = 0; i < (bdds.size()); i++)
        output[i] = bdds.get(i).execute(input)[0];
    
    return output;
}