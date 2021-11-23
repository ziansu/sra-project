private void addReadConversion(wyjc.Type et, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    addCheckCast(wyjc.Wyil2JavaBuilder.convertType(et), bytecodes);
}