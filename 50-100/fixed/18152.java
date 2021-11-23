public void writePushPop(java.lang.String operation, java.lang.String memory, int address, java.lang.String className) {
    if (operation.equals(CodeWriter.PUSH)) {
        writePush(memory, address, className);
    }else
        if (operation.equals(CodeWriter.POP)) {
            writePop(memory, address, className);
        }
    
}