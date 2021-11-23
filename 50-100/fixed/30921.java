private static void _messageDescriptionDead(characters.active.ActiveCharacter character) {
    java.util.ArrayList<grammars.grammars.PrintableObject> names = new java.util.ArrayList<grammars.grammars.PrintableObject>();
    java.util.ArrayList<java.lang.String> adjectives = new java.util.ArrayList<java.lang.String>();
    adjectives.add("dead");
    character.setAdjectives(adjectives);
    names.add(character);
    main.Main.generatePrintMessage(names, main.Main.grammarAdjectiveDescription, "DESCGENERAL", false, false);
}