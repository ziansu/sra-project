private void remove() {
    if (!(this.contentAssistant.isPresent()))
        this.contentAssistant.get().removeCompletionListener(this);
    
    if (!(this.quickAssistant.isPresent()))
        this.quickAssistant.get().removeCompletionListener(this);
    
}