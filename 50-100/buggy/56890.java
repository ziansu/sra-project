public static void main(java.lang.String[] args) throws java.lang.Exception {
    UMLParserMain.fileLocation = args[0];
    UMLParserMain.destination_URL = args[1];
    UMLParser parser = new UMLParser();
    java.lang.String grammar = parser.parseFile(UMLParserMain.fileLocation, UMLParserMain.destination_URL);
    MakeUML mu = new MakeUML();
    java.lang.String parseString = "[Customer|-forname:string;surname:string|doShiz()]<>-orders*>[Order], [Order]++-0..*>[LineItem], [Order]-[note:Aggregate root{bg:wheat}]";
    java.lang.String dst_Path = "test_diagram.jpg";
    mu.makeUML(parseString, dst_Path);
}