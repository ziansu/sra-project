public static void main(java.lang.String[] args) {
    try {
        Implementation.GridMetamodel.setUp();
        Implementation.Command cmd = Implementation.GridMetamodel.makeCommand(3);
        edu.mit.csail.sdg.alloy4compiler.translator.A4Solution solution = Implementation.GridMetamodel.run(cmd);
        Implementation.GridMetamodel.checkConstraints(null);
    } catch (Implementation.Err e) {
        e.printStackTrace();
    }
}