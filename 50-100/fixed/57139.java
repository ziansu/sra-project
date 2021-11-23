public boolean isPassing(sg.edu.nus.comp.codis.Program program, java.util.Map<sg.edu.nus.comp.codis.Parameter, sg.edu.nus.comp.codis.Constant> parameterValuation, sg.edu.nus.comp.codis.TestCase test) {
    sg.edu.nus.comp.codis.ProgramVariable result = new sg.edu.nus.comp.codis.ProgramVariable("<testResult>", test.getOutputType());
    java.util.List<sg.edu.nus.comp.codis.Node> clauses = test.getConstraints(result);
    clauses.add(new sg.edu.nus.comp.codis.ast.theory.Equal(program.getSemantics(parameterValuation), result));
    return solver.getModel(clauses).isPresent();
}