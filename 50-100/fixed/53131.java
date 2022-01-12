public static void main(java.lang.String[] args) throws java.io.IOException {
    SimpleInterpreter.ModeConfiguration config = new SimpleInterpreter.ModeConfiguration(args);
    java.io.InputStream is = (config.inOpt) ? new java.io.FileInputStream(config.inFile) : java.lang.System.in;
    SimpleInterpreter.CodeReader cr = new SimpleInterpreter.CodeReader(is);
    SymbolTable symTable = new SymbolTable();
    SimpleInterpreter.InterpretProgramViaStream(cr, symTable, config);
}