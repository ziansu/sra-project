private static void process(java.lang.String input, java.lang.String output) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.File file = new java.io.File(input);
    java.util.Scanner scanner = new java.util.Scanner(file);
    java.io.FileWriter writer = new java.io.FileWriter(output);
    while (scanner.hasNext()) {
        java.lang.String code = Backend.Generator.AssemblyTranslator.emit(scanner.next());
        java.lang.System.out.print((code + " "));
        writer.write((code + " "));
    } 
    writer.close();
}