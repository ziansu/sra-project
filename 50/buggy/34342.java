private void loadBaseConcepts() {
    for (java.lang.String concept : new java.lang.String[]{ "/Time Tagset/time" , "/Time Tagset/narrative_levels" , "/Time Tagset/timerelation_discours--histoire" , "/Time Tagset/self-reflexive_narration" , "/Time Tagset/disagreement_approved" }) {
        baseConcepts.add(concept);
    }
    logger.info(("base concepts: " + (baseConcepts)));
}