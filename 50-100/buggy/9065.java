public void start() throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.String input = "";
    do {
        showMainMenu();
        input = scanner.nextLine().trim().toLowerCase();
        switch (input) {
            case "q" :
                scanner.close();
                break;
            case "a" :
                loadLanguage(getJars());
                break;
            case "s" :
                switchLanguage();
            default :
        }
    } while (!(input.equals("q")) );
}