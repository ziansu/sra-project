public java.lang.String getText() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (org.wickedsource.docxstamper.docx4j.replace.IndexedRun run : runs) {
        builder.append(org.wickedsource.docxstamper.docx4j.util.RunUtil.getText(run.getRun()));
    }
    return builder.toString();
}