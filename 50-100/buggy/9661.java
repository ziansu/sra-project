private java.util.List<it.unibz.krdb.obda.model.CQIE> createSigmaRules(it.unibz.krdb.obda.ontology.Ontology ontology) {
    java.util.List<it.unibz.krdb.obda.model.CQIE> rules = new java.util.ArrayList<it.unibz.krdb.obda.model.CQIE>();
    java.util.Set<it.unibz.krdb.obda.ontology.Axiom> assertions = ontology.getAssertions();
    for (it.unibz.krdb.obda.ontology.Axiom assertion : assertions) {
        try {
            it.unibz.krdb.obda.model.CQIE rule = it.unibz.krdb.obda.owlrefplatform.core.basicoperations.AxiomToRuleTranslator.translate(assertion);
            rules.add(rule);
        } catch (java.lang.UnsupportedOperationException e) {
            log.warn(e.getMessage());
        }
    }
    return rules;
}