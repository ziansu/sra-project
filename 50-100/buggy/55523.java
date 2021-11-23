public static void mainLoop(com.andrewsoutar.cmp128.Utilities.GenericScanner kbdScanner, com.andrewsoutar.cmp128.Utilities.Function header, com.andrewsoutar.cmp128.Utilities.MenuAction[] choices) {
    java.util.HashMap<java.lang.String, com.andrewsoutar.cmp128.Utilities.MenuAction> choicesMap = new java.util.LinkedHashMap<java.lang.String, com.andrewsoutar.cmp128.Utilities.MenuAction>();
    for (int i = 0; i < (choices.length); i++) {
        choicesMap.put(java.lang.Integer.toString(i), choices[i]);
    }
    com.andrewsoutar.cmp128.Utilities.mainLoop(kbdScanner, header, choicesMap);
}