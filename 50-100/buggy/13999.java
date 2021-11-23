public void setForwardSlashIsSeparator(boolean forwardSlashIsSeparator) {
    if (forwardSlashIsSeparator) {
        httpSeparatorFlags.set('/');
    }else {
        httpSeparatorFlags.clear('/');
    }
    if (forwardSlashIsSeparator && (!(getAllowHttpSepsInV0()))) {
        allowedWithoutQuotes.set('/');
    }else {
        allowedWithoutQuotes.clear('/');
    }
}