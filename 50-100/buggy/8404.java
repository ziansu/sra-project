public java.lang.String getCombinationData() throws java.text.ParseException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (dataAnalyticsModel.TestBrief test : tests) {
        sb.append("{ x:").append(test.getHealth()).append(", ").append(" y:").append(test.getTrust()).append("},");
    }
    sb.setLength(((sb.length()) - 1));
    return sb.toString();
}