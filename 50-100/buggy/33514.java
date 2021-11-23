private void printAvailableCommands() {
    java.lang.System.out.println(languages.get(selectedLanguage).getAvailable());
    for (java.lang.String c : commands.get(selectedLanguage).keySet()) {
        java.lang.System.out.println(((("(" + c) + ") ") + (commands.get(selectedLanguage).get(c).getHelp())));
    }
}