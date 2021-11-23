public static void main(java.lang.String[] args) throws brainfuck.virtualmachine.OverflowException {
    brainfuck.virtualmachine.Machine machine = new brainfuck.virtualmachine.Machine();
    brainfuck.ArgParser parser = new brainfuck.ArgParser(args);
    machine.executeOp("INCR");
    java.lang.System.out.println(machine.dumpMemory());
    machine.executeOp('-');
    java.lang.System.out.println(machine.dumpMemory());
}