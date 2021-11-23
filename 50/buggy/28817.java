public java.util.List<edu.pugetsound.mathcs.nlp.kb.PrologStructure> query(edu.pugetsound.mathcs.nlp.kb.PrologStructure struct) {
    try {
        edu.pugetsound.mathcs.nlp.kb.KBController.queryHelp(edu.pugetsound.mathcs.nlp.kb.KBController.env.createInterpreter(), struct.getName(), struct.getArguments());
    } catch (gnu.prolog.vm.PrologException e) {
    }
    return null;
}