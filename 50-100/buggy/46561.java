@org.junit.Test
public void testHasLoop() {
    org.pb.x12.Loop loop = new org.pb.x12.Loop(new org.pb.x12.Context('~', '*', ':'), "ISA");
    loop.addChild("GS");
    loop.addChild("ST");
    assertEquals(new java.lang.Boolean(true), new java.lang.Boolean(loop.hasLoop("ST")));
}