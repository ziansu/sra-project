@java.lang.Override
public boolean accept(org.apache.hadoop.fs.Path path) {
    java.lang.String ext = libra.common.helpers.PathHelper.getExtensionWithoutCompressed(path.getName());
    if (ext != null) {
        ext = ext.toLowerCase();
    }
    for (java.lang.String fext : libra.common.sequence.FastaPathFilter.FASTA_EXT) {
        if (fext.equals(ext)) {
            return true;
        }
    }
    return false;
}