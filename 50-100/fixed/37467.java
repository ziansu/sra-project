public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (button)) {
        input = txt.getText();
        context.healthinformatics.Parser.XMLParser xmlp = new context.healthinformatics.Parser.XMLParser(input);
        try {
            xmlp.parse();
        } catch (java.io.IOException e1) {
            java.lang.System.out.println("No such file... Try again!");
        }
    }
}