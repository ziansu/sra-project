public java.lang.String getSaveErrorMessages() {
    int errorsAndWarnings = (saveErrorCount) - (aspaceErrorCount);
    java.lang.String errorMessage = (((((((((("RECORD CONVERSION ERRORS/WARNINGS ( " + errorsAndWarnings) + " ) ::\n\n") + (errorBuffer.toString())) + "\n\n\nRECORD SAVE ERRORS ( ") + (aspaceErrorCount)) + " ) ::\n\n") + (aspaceClient.getErrorMessages())) + "\n\nTOTAL COPY TIME: ") + (stopWatch.getPrettyTime())) + "\n\nNUMBER OF RECORDS COPIED: \n") + (getTotalRecordsCopiedMessage());
    return errorMessage;
}