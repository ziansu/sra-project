public void start(int cantidadInstrucciones) throws java.lang.InterruptedException {
    registers.writeAddress("0000", "10101001");
    registers.writeAddress("0001", "100101010");
    java.lang.System.out.println(("cant " + cantidadInstrucciones));
    while (cantidadInstrucciones > 0) {
        java.lang.String instruction = fetch();
        java.util.ArrayList<java.lang.String> decoded = decode(instruction);
        java.util.ArrayList<java.lang.String> executed = execute(decoded);
        java.util.ArrayList<java.lang.String> memory = memory(executed);
        writeBack(memory);
        cantidadInstrucciones--;
    } 
}