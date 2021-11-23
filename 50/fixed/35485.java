public void focus() {
    focused = true;
    if ((prompting) && (!(readonly))) {
        setPromptingOff("");
    }
    tb.setFocus(true);
}