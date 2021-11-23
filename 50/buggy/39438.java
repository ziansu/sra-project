public void parseToKAF(ixa.kaflib.KAFDocument kaf) throws java.lang.Exception {
    parsedDoc = this.getParse(kaf);
    kaf.addConstituencyFromParentheses(parsedDoc.toString());
    java.lang.System.out.print(kaf.toString());
}