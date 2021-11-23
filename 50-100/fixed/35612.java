public void setDuring(java.lang.String during) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("片长：[0-9]*分钟");
    java.util.regex.Matcher matcher = pattern.matcher(during);
    if (matcher.find()) {
        during = matcher.group().split("：")[1];
        during = during.replace("分钟", "");
        this.during = java.lang.Double.parseDouble(during);
    }
}