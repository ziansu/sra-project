public void checkParseInfo() {
    java.lang.System.out.println(("Title " + (tab2pdf.Processor.title)));
    java.lang.System.out.println(("Subtitle " + (tab2pdf.Processor.subtitle)));
    java.lang.System.out.println(("Spacing " + (tab2pdf.Processor.spacing)));
    if ((tab2pdf.Processor.spacing) == 0) {
        tab2pdf.Processor.spacing = 5;
    }
    java.lang.System.out.println(("Spacing " + (tab2pdf.Processor.spacing)));
}