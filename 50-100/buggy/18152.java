public void writePushPop(java.lang.String operation, java.lang.String memory, int address) {
    if (operation.equals(CodeWriter.PUSH)) {
        writePush(memory, address);
    }else
        if (operation.equals(CodeWriter.POP)) {
            writePop(memory, address);
        }
    
}