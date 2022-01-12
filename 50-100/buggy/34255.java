private void parserJsonCKExp(java.lang.String expression) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile(com.sanderswangbin.jsonck.JsonCKExp.REG_JSONCK_EXPRESS).matcher(expression);
    if (m.find()) {
        expVar = m.group(1);
        expOp = m.group(2);
        expValue = m.group(3);
        expType = getType(expValue);
    }
}