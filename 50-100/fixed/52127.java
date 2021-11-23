@org.junit.Test
public void executeDivInstruction() {
    prog1.addInstruction(new businessModel.instructions.Div());
    micro.load(prog1);
    micro.start();
    micro.setRegister("A", 100);
    micro.setRegister("B", 50);
    micro.execute();
}