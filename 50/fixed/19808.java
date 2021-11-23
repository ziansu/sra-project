public static yaplstack.Instruction.IncIP loadVar(int ordinal) {
    return ( thread) -> {
        java.lang.Object value = thread.callFrame.get(ordinal);
        thread.callFrame.push(value);
    };
}