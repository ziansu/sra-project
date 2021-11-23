@java.lang.Override
public java.lang.String getRawDataAccession() {
    return org.icgc.dcc.common.core.util.Joiners.COLON.join(getAnalyzedFileId(), getMatchedFileId());
}