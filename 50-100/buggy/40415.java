@java.lang.Override
public void exitSbc(com.kasirgalabs.arm.ArmParser.SbcContext ctx) {
    int result = (rnRegister.getValue()) - (operand2.getValue());
    if (cpsr.isCarry()) {
        result--;
    }
    rdRegister.setValue(result);
    rdRegister.update();
}