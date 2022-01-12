public static void main(java.lang.String[] args) throws java.io.IOException {
    ch.ice.controller.file.SegmentExcelParser Parser = new ch.ice.controller.file.SegmentExcelParser();
    ch.ice.compare.ListComparison Comparer = new ch.ice.compare.ListComparison();
    ch.ice.controller.file.SegmentExcelWriter Writer = new ch.ice.controller.file.SegmentExcelWriter();
    java.util.ArrayList<java.lang.String> ListPos2 = Parser.readPOSFile();
    java.util.ArrayList<ch.ice.model.Segment> ListReg2 = Parser.readRegisterFile();
    java.util.ArrayList<ch.ice.model.Segment> ListSegmented = Comparer.compareLists(ListReg2, ListPos2);
    java.lang.System.out.println("Time to Segment");
    Writer.writeXLSXFile(ListSegmented);
    java.lang.System.out.println("Done");
}