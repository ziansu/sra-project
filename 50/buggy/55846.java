void updateSubmitButton(boolean working) {
    submit.setHighlighted((!working));
    setEnabled(working);
}