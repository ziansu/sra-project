public static void writeConllLines(java.lang.String docName, java.lang.String[][] docConllLines, java.io.PrintWriter writer) {
    writer.println((("#begin document (" + docName) + "); part 000"));
    for (java.lang.String[] sentenceConllLines : docConllLines) {
        if (sentenceConllLines == null) {
            continue;
        }
        for (java.lang.String conllLine : sentenceConllLines) {
            writer.println(conllLine);
        }
        writer.println();
    }
    writer.println("#end document");
}