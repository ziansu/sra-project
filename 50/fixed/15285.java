public boolean evaluate(java.lang.String s, com.kizna.html.scanners.HTMLTagScanner previousOpenScanner) {
    absorbLeadingBlanks(s);
    if ((s.toUpperCase().equals("TITLE")) && (previousOpenScanner == null))
        return true;
    else
        return false;
    
}