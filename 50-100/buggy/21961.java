private static void setSw() {
    Control.signals.put("regDst", (-1));
    Control.signals.put("memToReg", (-1));
    Control.signals.put("ALUSrc", 1);
    Control.signals.put("regWrite", 0);
    Control.signals.put("memRead", 0);
    Control.signals.put("memWrite", 1);
    Control.signals.put("branch", 0);
    Control.signals.put("ALUOp", java.lang.Integer.parseInt("00", 2));
}