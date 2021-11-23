public int getChoiceId() {
    if ((group.getSelection()) == null) {
        return -1;
    }
    return java.lang.Integer.valueOf(group.getSelection().getActionCommand());
}