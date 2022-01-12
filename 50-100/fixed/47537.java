public static void main(java.lang.String[] args) {
    try {
        java.lang.String path = args[0];
        oop.ex6.main.Parser parser = new oop.ex6.main.Parser();
        parser.analyzerFile(path);
        parser.parser();
        java.lang.System.out.println(oop.ex6.main.Sjavac.LEGAL_FILE);
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        java.lang.System.err.println(e.getMessage());
    } catch (java.io.IOException e) {
        java.lang.System.out.println(oop.ex6.main.Sjavac.FILE_ERROR);
    } catch (oop.ex6.main.IllegalException e) {
        java.lang.System.err.println(e.getMessage());
        java.lang.System.out.println(oop.ex6.main.Sjavac.ILLEGAL_FILE);
    }
}