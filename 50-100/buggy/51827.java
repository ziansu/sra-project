private simulizer.assembler.representation.Address getProgramCounter(simulizer.simulation.cpu.components.CPU cpu) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchFieldException, java.lang.SecurityException {
    java.lang.reflect.Field pc = cpu.getClass().getDeclaredField("programCounter");
    pc.setAccessible(true);
    simulizer.assembler.representation.Address programCounter = ((simulizer.assembler.representation.Address) (pc.get(cpu)));
    return programCounter;
}