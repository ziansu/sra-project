private void writeHaploid(final byte[] sequence, java.util.Hashtable<java.lang.Integer, com.bina.varsim.types.FlexSeq> ins_seq, final java.lang.String sequenceName, final java.lang.String sequenceFileName, final java.lang.Boolean outputFlag) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(new java.io.File(outDir, sequenceFileName));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        writeGenome(bw, sequenceName, sequence, ins_seq);
        bw.close();
        fw.close();
    } catch (java.io.IOException ex) {
        com.bina.varsim.tools.simulation.VCF2diploid.log.error(ex.toString());
    }
}