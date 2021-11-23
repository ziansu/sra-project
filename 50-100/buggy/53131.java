public static void main(java.lang.String[] args) throws java.io.IOException {
    SimpleInterpreter.ModeConfiguration config = new SimpleInterpreter.ModeConfiguration(args);
    java.io.InputStream is = (config.inOpt) ? new java.io.FileInputStream(config.inFile) : java.lang.System.in;
    SimpleInterpreter.CodeReader cr = new SimpleInterpreter.CodeReader(is);
    SymbolTable symTable = new SymbolTable();
    java.lang.String code = cr.readCodes();
    while (code != null) {
        SimpleInterpreter.InterpretProgramViaStream(code, symTable, config);
        code = cr.readCodes();
    } 
}