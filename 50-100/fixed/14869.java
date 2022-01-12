public static void main(java.lang.String[] args) {
    IO.Reader r = new IO.Reader();
    java.lang.String file = r.read("/Users/Admin/Documents/Github/zed/Compiler/Project/Syntax/", "test.zed");
    java.lang.System.out.println(file);
    java.lang.Compiler c = new java.lang.Compiler(file);
    c.compile();
    java.lang.System.out.println(c.getError());
    java.lang.System.out.println(c.getFile());
}