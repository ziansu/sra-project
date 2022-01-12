@java.lang.Override
public void setPosition(int offsetWidth, int offsetHeight) {
    int adjustedLeft = left;
    if (showLeft)
        adjustedLeft = (left - offsetWidth) - H_PAD;
    
    setPopupPosition(adjustedLeft, ((top - (getOffsetHeight())) - V_PAD));
}