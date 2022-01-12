private void readStream(java.io.InputStream inputStream) throws java.io.IOException {
    boolean isPreviousLineCRLF = false;
    while (true) {
        if (currentStreamEnded)
            break;
        else {
            if (readingHeaderLines) {
                isPreviousLineCRLF = readMessageSipHeaderLines(inputStream, isPreviousLineCRLF);
            }
            if (readingMessageBodyContents) {
                readMessageBody(inputStream);
            }
        }
    } 
}