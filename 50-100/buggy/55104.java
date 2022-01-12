private static void sub(com.github.jackkell.cpuemulator.util.MemoryArg destination, com.github.jackkell.cpuemulator.util.ConstantArg source) throws java.lang.Exception {
    com.github.jackkell.cpuemulator.cpu.Alu.checkSize(destination.getSize(), source.getSize());
    long value1 = destination.getValue();
    long value2 = source.getValue();
    long result = value1 + value2;
    Memory.memory.put(destination.getName(), new com.github.jackkell.cpuemulator.cpu.MemoryValue(source.getSize(), result));
    com.github.jackkell.cpuemulator.cpu.Alu.updateFlags(destination.getSize(), value1, value2, result);
}