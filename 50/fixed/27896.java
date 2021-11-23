public int getChoiceId() {
    if ((group.getSelection()) == null) {
        return 0;
    }
    return java.lang.Integer.valueOf(group.getSelection().getActionCommand());
}