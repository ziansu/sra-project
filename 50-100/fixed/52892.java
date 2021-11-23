public static void main(java.lang.String[] args) {
    java.lang.System.out.println("*****");
    interpreter.SeqStmt stmt = parser.Sandbox.grammar.parse("print foo; foo = 3; print foo; foo = 0; if foo then (print 2; print 3) else (print 4; print 5)");
    java.lang.System.out.println("*****");
    interpreter.SeqStmt biznatchStmt = parser.Sandbox.biznatch.parse("printthisbiznatch 6000 thendothisbiznatch printthisbiznatch yo 900 addthisbiznatch 400 mama");
    interpreter.SeqStmt stmt2 = parser.Sandbox.tester.parse("print (2 plus 2)");
}