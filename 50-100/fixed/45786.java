public java.lang.String getTagName() {
    java.lang.String tagName = "channel0";
    if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(this.getFileName(), "front.avi")) {
        tagName = "channel0";
    }
    if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(this.getFileName(), "left.avi")) {
        tagName = "channel1";
    }
    if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(this.getFileName(), "right.avi")) {
        tagName = "channel2";
    }
    if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(this.getFileName(), "rear.avi")) {
        tagName = "channel3";
    }
    return tagName;
}