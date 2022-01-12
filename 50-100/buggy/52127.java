@org.junit.Test
public void executeDivInstruction() {
    prog1.addInstruction(new businessModel.instructions.Div());
    micro.load(prog1);
    micro.start();
    micro.setRegister("A", 50);
    micro.setRegister("B", 100);
    micro.execute();
}