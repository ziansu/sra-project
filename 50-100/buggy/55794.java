@java.lang.Override
public void startNewSection(java.lang.String sectionTitle, com.compomics.util.io.export.WorkbookStyle textStyle) throws java.io.IOException {
    if (sectionTitle != null) {
        writer.write(sectionTitle);
    }
    if ((nSections) > 0) {
        for (int i = 1; i <= (nSeparationLines); i++) {
            writer.newLine();
        }
    }
    (nSections)++;
}