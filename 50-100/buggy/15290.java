private static void findAssociationRules() {
    try {
        if ((apriori_map.AssociationRules.allFrequentItemsets.size()) >= 2)
            apriori_map.AssociationRules.findRulesForPairs();
        
        if ((apriori_map.AssociationRules.allFrequentItemsets.size()) >= 3)
            apriori_map.AssociationRules.findRulesForTriples();
        
        if ((apriori_map.AssociationRules.allFrequentItemsets.size()) >= 4)
            apriori_map.AssociationRules.findRulesForQuadruples();
        
    } catch (java.lang.NullPointerException e) {
    }
}