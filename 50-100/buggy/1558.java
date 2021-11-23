private void whileCompile() throws java.io.IOException {
    clearFile(this.compFile);
    try {
        this.userCode = ((java.lang.String) (input.readObject()));
        java.lang.System.out.println("Compiling code ... ");
        compileCode(userCode);
        output.writeObject(result);
        java.lang.System.out.println("Done compiling");
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.out.println("Don't know object type");
    }
}