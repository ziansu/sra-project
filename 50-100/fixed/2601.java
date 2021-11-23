public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.System.out.println("Bienvenido al programa de calculadora!");
    java.io.BufferedReader file = new java.io.BufferedReader(new java.io.FileReader("Prueba.txt"));
    Op calculadora = new Op();
    java.lang.String operacion = file.readLine();
    java.lang.System.out.println(operacion);
    java.lang.System.out.println(calculadora.operar(operacion));
}