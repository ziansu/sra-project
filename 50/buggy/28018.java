@java.lang.Override
public void run() {
    peekPercent = getValidPeekPercent();
    if ((currentPercent) != (peekPercent)) {
        currentPercent = peekPercent;
        onHide((1 - (peekPercent)));
    }
}