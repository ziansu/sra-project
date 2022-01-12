public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String row = "void foo(int a){";
    oop.ex6.main.Parser pars = new oop.ex6.main.Parser();
    java.lang.String line = " char a ='r',b, c='r' ";
    try {
        java.lang.System.out.println(oop.ex6.main.Parser.extractFirstWord("abc%%", 3));
    } catch (oop.ex6.main.IllegalException e) {
        e.printStackTrace();
        java.lang.System.out.println(e.getMessage());
    }
}