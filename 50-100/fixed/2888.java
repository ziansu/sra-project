public static void _descriptionAction(int i) {
    if ((main.Main.user.getInventory().size()) > 0) {
        java.util.ArrayList<grammars.grammars.PrintableObject> names = new java.util.ArrayList<grammars.grammars.PrintableObject>();
        names.add(main.Main.user);
        for (items.Item item : main.Main.user.getInventory()) {
            names.add(item);
        }
        grammars.grammars.GrammarIndividual grammarIndividual = main.Main.grammarUseItem.getRandomGrammar();
        main.Main._printMessage(grammarIndividual, names, "DESCITEM");
    }
    main.Main.hasChanged = false;
}