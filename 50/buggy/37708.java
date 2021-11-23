public void setMessageSubmissionError(boolean error) {
    if ((messageSubmissionError) != error)
        messageSubmissionError = error;
    
    refreshDrawableState();
}