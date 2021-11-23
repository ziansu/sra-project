@java.lang.Override
public int getEV() {
    return java.lang.Integer.parseInt(_element.getFirstChildElement("earnedValue").getValue());
}