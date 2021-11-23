@java.lang.Override
public void visitFile(com.sonar.sslr.api.AstNode astNode) {
    try (java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(getContext().getFile(), "r")) {
        if (!(org.sonar.jproperties.checks.MissingNewlineAtEndOfFileCheck.endsWithNewline(randomAccessFile))) {
            addIssueOnFile(this, "Add an empty new line at the end of this file.");
        }
    } catch (java.io.IOException e) {
        throw new org.sonar.api.utils.SonarException(e);
    }
}