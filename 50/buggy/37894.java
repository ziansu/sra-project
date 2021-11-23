private static void generateSuffix(boolean withWrapping, de.fhg.iais.roberta.syntax.codegen.CppCodeGenerationVisitor astVisitor) {
    if (withWrapping) {
        astVisitor.nlIndent();
        astVisitor.sb.append("release_fiber();");
        astVisitor.sb.append("\n}\n");
    }
}