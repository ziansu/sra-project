public static void printEnumeration(java.util.List<Print.Printable> printables, java.lang.String[] point_descriptions, java.lang.String[] texts, java.lang.String title) {
    switch (Print.Printer.printmode) {
        case NO :
            break;
        case CONSOLE :
            Print.Printer.printEnumerationConsole(printables, point_descriptions, texts);
            break;
        case LATEX :
            Print.Printer.printEnumerationLatex(printables, point_descriptions, texts, title);
            break;
    }
}