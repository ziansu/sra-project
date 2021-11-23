public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (button)) {
        input = txt.getText();
        context.healthinformatics.Parser.XMLParser xmlp = new context.healthinformatics.Parser.XMLParser(input);
        try {
            xmlp.parse();
            context.healthinformatics.Parser.TXTParser txtp = new context.healthinformatics.Parser.TXTParser(xmlp.getPath(), xmlp.getStartLine(), xmlp.getDelimiter(), xmlp.getColumns());
            txtp.parse();
        } catch (java.io.IOException e1) {
            java.lang.System.out.println("No such file... Try again!");
        }
    }
}