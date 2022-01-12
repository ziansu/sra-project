@java.lang.Override
public boolean onPreDraw() {
    if (!(isInitTextView)) {
        return true;
    }
    textLines = textView.getLineCount();
    isExpandNeeded = (textLines) > (expandLines);
    isInitTextView = false;
    if (isExpandNeeded) {
        isShrink = true;
        doAnimation(expandLines, expandLines, WHAT_ANIMATION_END);
    }else {
        isShrink = false;
        doNotExpand();
    }
    return true;
}