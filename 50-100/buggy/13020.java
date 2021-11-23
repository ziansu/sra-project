@java.lang.Override
public boolean accept(org.apache.hadoop.fs.Path path) {
    java.lang.String ext = libra.common.helpers.PathHelper.getExtensionWithoutCompressed(path.getName()).toLowerCase();
    for (java.lang.String fext : libra.common.sequence.FastaPathFilter.FASTA_EXT) {
        if (ext.equals(fext)) {
            return true;
        }
    }
    return false;
}