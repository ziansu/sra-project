private static boolean handleMainBlocks(de.fhg.iais.roberta.syntax.codegen.CppCodeGenerationVisitor astVisitor, boolean mainBlock, de.fhg.iais.roberta.syntax.Phrase<java.lang.Void> phrase) {
    if ((phrase.getKind().getCategory()) != (de.fhg.iais.roberta.components.Category.TASK)) {
        astVisitor.nlIndent();
    }else
        if (!(phrase.getKind().hasName("LOCATION"))) {
            mainBlock = true;
        }
    
    return mainBlock;
}