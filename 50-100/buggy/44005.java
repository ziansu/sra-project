public java.util.Date validate(java.lang.String time) {
    java.util.Date ora = null;
    matcher = pattern.matcher(time);
    if (matcher.matches())
        try {
            ora = formatter.parse(time);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    
    return ora;
}