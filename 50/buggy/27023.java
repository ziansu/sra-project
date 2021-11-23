@java.lang.Override
public OpenRate.record.TrailerRecord procTrailer(OpenRate.record.TrailerRecord r) {
    closeFiles(getTransactionNumber());
    return r;
}