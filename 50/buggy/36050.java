@java.lang.Override
@javax.annotation.Nullable
public com.google.cloud.genomics.utils.Contig apply(@javax.annotation.Nullable
com.google.cloud.genomics.utils.Contig arg0) {
    return new com.google.cloud.genomics.utils.Contig(arg0.referenceName, ((arg0.start) + 1), ((arg0.end) + 1));
}