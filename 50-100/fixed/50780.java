public void removePath(edu.utsa.fileflow.filestructure.FilePath path) throws edu.utsa.fileflow.compiler.CompilerException {
    boolean $post = postcondition.existsInNegative(path);
    boolean pre = precondition.existsInPositive(path);
    boolean $pre = precondition.existsInNegative(path);
    edu.utsa.fileflow.filestructure.FileStructure removedFile = postcondition.removePositive(path);
    if (removedFile == null) {
    }
    try {
        postcondition.insertNegative(path);
    } catch (edu.utsa.fileflow.filestructure.FileStructureException e) {
        e.printStackTrace();
    } catch (edu.utsa.fileflow.filestructure.FileFlowWarning e) {
    }
}