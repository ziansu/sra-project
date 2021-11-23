@java.lang.Override
public void exitSbcs(com.kasirgalabs.arm.ArmParser.SbcsContext ctx) {
    int result = (rnRegister.getValue()) - (operand2.getValue());
    cpsr.subtractionUpdateNZV(rnRegister.getValue(), operand2.getValue());
    if (!(cpsr.isCarry())) {
        if (!(cpsr.isOverflow())) {
            cpsr.subtractionUpdateNZV(result, 1);
        }
        result--;
    }
    rdRegister.setValue(result);
    rdRegister.update();
}