@org.junit.Test
public void test_cmd_mf() {
    java.lang.String fileName = ((sbolDir) + "CRISPR_example") + ".xml";
    java.lang.String fileName2 = "meherGolden_RepressionModel";
    java.lang.String mainfile = "";
    java.lang.String inputfile2 = ((sbolDir) + fileName2) + ".xml";
    java.lang.String outputFile = "";
    java.lang.String compareFile = "";
    java.lang.String[] converter_cmdArgs = new java.lang.String[]{ "-no" , "-mf" , mainfile , "-cf" , inputfile2 , fileName , "-o" , outputFile , "-e" , compareFile };
    conversion.Converter.main(converter_cmdArgs);
}