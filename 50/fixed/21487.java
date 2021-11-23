public static void eliminateSeesClauses(de.be4.classicalb.core.parser.node.Start start, java.util.Map<java.lang.String, de.be4.classicalb.core.parser.node.Start> parsedMachines) {
    new de.tlc4b.analysis.transformation.SeesEliminator(start, parsedMachines, new java.util.ArrayList<java.lang.String>());
}