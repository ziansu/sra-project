private void parserJsonCKExp(java.lang.String expression) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile(com.sanderswangbin.jsonck.JsonCKExp.REG_JSONCK_EXPRESS).matcher(expression);
    if (m.find()) {
        expVar = m.group(1).trim();
        expOp = m.group(2).trim();
        expValue = m.group(3).trim();
        expType = getType(expValue);
    }
}