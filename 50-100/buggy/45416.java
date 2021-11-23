protected void updateBlocks(java.lang.String s, edu.ucsb.cs56.projects.utilities.cs56_utilities_binary_clock.Block[] blocks) {
    for (int i = 0; i < (java.lang.reflect.Array.getLength(blocks)); i++) {
        if (i < (s.length()))
            blocks[i].input(s.charAt((((s.length()) - 1) - i)));
        else
            blocks[i].input('0');
        
    }
}