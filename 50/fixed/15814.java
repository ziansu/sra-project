private static void writeLine(java.lang.String line) {
    try {
        Printer.writer.write(line);
        Printer.writer.newLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error writing to file");
    }
}