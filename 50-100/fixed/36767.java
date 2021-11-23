public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        com.github.taffy128s.tlcdbms.Interpreter interpreter = new com.github.taffy128s.tlcdbms.Interpreter();
        interpreter.start();
    }else {
        for (java.lang.String arg : args) {
            com.github.taffy128s.tlcdbms.FileInterpreter fileInterpreter = new com.github.taffy128s.tlcdbms.FileInterpreter(arg);
            fileInterpreter.start();
        }
    }
}