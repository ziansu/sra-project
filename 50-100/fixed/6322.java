public java.lang.String userLabel(int idx) {
    frame.UserFrame uFrame = getUserFrame(idx);
    if (uFrame != null) {
        if ((uFrame.getName().length()) > 0) {
            return java.lang.String.format("%s (%d)", uFrame.getName(), (idx + 1));
        }
        return java.lang.Integer.toString((idx + 1));
    }
    return null;
}