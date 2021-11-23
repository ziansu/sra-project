public void setAutosave(boolean flag) {
    s.setAutosave(flag);
    if (flag) {
        save();
    }
}