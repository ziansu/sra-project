@java.lang.Override
public int getEV() {
    java.lang.System.out.println(_element.toXML());
    return java.lang.Integer.parseInt(_element.getFirstChildElement("earnedValue").getValue());
}