public void setForwardSlashIsSeparator(boolean forwardSlashIsSeparator) {
    if (forwardSlashIsSeparator) {
        httpSeparatorFlags.set('/');
    }else {
        httpSeparatorFlags.clear('/');
    }
    if (forwardSlashIsSeparator && (!(getAllowHttpSepsInV0()))) {
        allowedWithoutQuotes.clear('/');
    }else {
        allowedWithoutQuotes.set('/');
    }
}