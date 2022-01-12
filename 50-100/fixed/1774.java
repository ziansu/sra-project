public void processText(java.lang.String sms) throws java.lang.Exception {
    for (java.lang.String regEx : map.keySet()) {
        if (sms.matches(regEx)) {
            framework.CommandHandler ch = map.get(regEx);
            if (ch != null) {
                java.util.regex.Pattern strMatch = java.util.regex.Pattern.compile(regEx);
                java.util.regex.Matcher m = strMatch.matcher(sms);
                if (m.find()) {
                    ch.process(m);
                }
            }
            return ;
        }
    }
    throw new java.lang.RuntimeException("No regEx match");
}