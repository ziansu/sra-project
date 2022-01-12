@java.lang.Override
public java.lang.String toString() {
    java.lang.String notIndicator = "";
    if (clickOnNotColor)
        notIndicator = "!";
    
    return ((("if(" + notIndicator) + (common.SwingUtil.color2Str(color))) + ")") + (super.toString());
}