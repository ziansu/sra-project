private void add() {
    if (this.contentAssistant.isPresent())
        this.contentAssistant.get().addCompletionListener(this);
    
    if (this.quickAssistant.isPresent())
        this.quickAssistant.get().addCompletionListener(this);
    
}