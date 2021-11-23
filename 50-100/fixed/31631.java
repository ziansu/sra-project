public static void main(java.lang.String[] args) {
    org.ocpsoft.prettytime.nlp.PrettyTimeParser parser = new org.ocpsoft.prettytime.nlp.PrettyTimeParser();
    java.lang.String keyword = "ClEaR";
    java.lang.String newWord = keyword.toLowerCase();
    if (newWord.equals("clear")) {
    }
    java.util.List<java.util.Date> date3 = parser.parse("tmr 10pm");
    java.lang.System.out.println(new java.util.Date());
}