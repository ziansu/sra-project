private void write(wyil.lang.Codes.Debug function) throws java.lang.Exception {
    java.lang.String functionText = "";
    java.lang.System.out.println(((((("debug:: " + (function.toString())) + "\n type:: ") + (function.type.toString())) + "\n regs:: ") + (function.operand)));
    functionText = (((getIndentBlock()) + "WyJS.debug(r") + (function.operand)) + ");\n";
    js.add(functionText);
}