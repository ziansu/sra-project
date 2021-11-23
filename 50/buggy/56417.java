public int getAutoCloseMode() {
    if ((consoleProcess_) == null) {
        return autoCloseMode_;
    }
    autoCloseMode_ = consoleProcess_.getProcessInfo().getAutoCloseMode();
    return autoCloseMode_;
}