private java.lang.String convertReg(java.lang.String in) throws site.projectname.err.SyntaxErrorException {
    in = in.substring(1);
    return site.projectname.util.Numbers.convert(10, 2, false, in, 3);
}