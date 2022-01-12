private void generateContent(java.lang.StringBuilder sb, java.util.ArrayList<jacob.model.Paragraph> paragraphArrayList) {
    java.lang.String lastChapterTitle = "";
    for (jacob.model.Paragraph paragraph : paragraphArrayList) {
        if (!(paragraph.getTitle().equals(lastChapterTitle))) {
            appendH2(sb, paragraph.getTitle());
            lastChapterTitle = paragraph.getTitle();
        }
        appendContent(sb, paragraph);
    }
}