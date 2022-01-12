private static java.lang.String hasTimerExpired(java.lang.String itemInfo) {
    org.jdom2.Element eItem = org.yawlfoundation.yawl.util.JDOMUtil.stringToElement(itemInfo);
    return eItem == null ? "false" : java.lang.String.valueOf(((eItem.getChildText("timerexpiry")) != null));
}