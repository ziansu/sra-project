public void displayAssociationRules() {
    java.lang.System.out.println("\n==== Association Rules ====\n");
    for (int i = 0; i < (apriori_map.AssociationRules.associationRules.size()); i++) {
        java.lang.String[] rule = apriori_map.AssociationRules.associationRules.get(i);
        java.lang.System.out.println((((((rule[0]) + " -> ") + (rule[1])) + "\t") + (rule[2])));
    }
}