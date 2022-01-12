public synchronized boolean isLexicalFinishedWithouError() {
    return (mIsLexicalFinished) && ((mTokenBuffer.size()) == 0);
}