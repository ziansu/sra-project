public void print(java.io.PrintStream output) {
    output.println(toString());
    for (int z = 0; z < (science.powell.lib.mc.nbt.MCRFile.ZWIDTH); z++) {
        for (int x = 0; x < (science.powell.lib.mc.nbt.MCRFile.XWIDTH); x++) {
            if ((data[x][z]) != null) {
                data[x][z].print(1, output);
            }
        }
    }
}