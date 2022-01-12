public void generateProblem(doc.mathobjects.ProblemGenerator generator) {
    java.util.Vector<doc.mathobjects.ProblemGenerator> generators = new java.util.Vector<doc.mathobjects.ProblemGenerator>();
    generators.add(generator);
    java.util.Vector<java.lang.Integer> frequencies = new java.util.Vector<java.lang.Integer>();
    frequencies.add(100);
    generateProblems(generators, frequencies, 1, null, true);
}