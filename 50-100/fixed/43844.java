public static void printWithTitle(java.lang.String title, Print.Printable printable) {
    switch (Print.Printer.printmode) {
        case NO :
            break;
        case CONSOLE :
            Print.Printer.printWithTitleConsole(title, printable);
            break;
        case LATEX :
            Print.Printer.printWithTitleLatex(title, printable);
            break;
    }
}