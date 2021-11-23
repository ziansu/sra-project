public java.lang.String getSaveErrorMessages() {
    int errorsAndWarnings = java.lang.Math.abs(((aspaceErrorCount) - (saveErrorCount)));
    java.lang.String errorMessage = (((((((((("RECORD CONVERSION ERRORS/WARNINGS ( " + errorsAndWarnings) + " ) ::\n\n") + (errorBuffer.toString())) + "\n\n\nRECORD SAVE ERRORS ( ") + (saveErrorCount)) + " ) ::\n\n") + (aspaceClient.getErrorMessages())) + "\n\nTOTAL COPY TIME: ") + (stopWatch.getPrettyTime())) + "\n\nNUMBER OF RECORDS COPIED: \n") + (getTotalRecordsCopiedMessage());
    return errorMessage;
}