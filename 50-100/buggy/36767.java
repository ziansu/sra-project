public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        com.github.taffy128s.tlcdbms.Interpreter interpreter = new com.github.taffy128s.tlcdbms.Interpreter();
        interpreter.start();
    }else
        if ((args.length) > 0) {
            for (java.lang.String arg : args) {
                com.github.taffy128s.tlcdbms.FileInterpreter fileInterpreter = new com.github.taffy128s.tlcdbms.FileInterpreter(arg);
                fileInterpreter.start();
            }
        }else {
            java.lang.System.out.println("usage: executable [file1] [file2] [file3] ...");
        }
    
}