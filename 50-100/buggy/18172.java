public static com.bajetii.proiecttc.ParserTable generateParserTable(java.util.List<com.bajetii.proiecttc.Configs> automat, java.util.List<com.bajetii.proiecttc.ProductionRule> rules) {
    java.util.List<java.lang.Character> auxElem = new java.util.LinkedList<>();
    auxElem.addAll(com.bajetii.proiecttc.Main.elements);
    com.bajetii.proiecttc.ParserTable table = new com.bajetii.proiecttc.ParserTable(auxElem, automat, rules);
    java.lang.System.out.println(table);
    java.lang.System.out.println(("Is grammar LR(1)? " + (!(table.hasConflicts))));
    return table;
}