@java.lang.Override
public void describeFormat(org.jtrfp.jfdt.Parser prs) throws org.jtrfp.jfdt.UnrecognizedFormatException {
    prs.stringEndingWith(",", prs.property("x", java.lang.Integer.class), false);
    prs.stringEndingWith(",", prs.property("y", java.lang.Integer.class), false);
    prs.stringEndingWith(new java.lang.String[]{ "\r\n" , "\n" }, prs.property("z", java.lang.Integer.class), false);
}