public static void main(java.lang.String[] args) {
    MainInterface.init();
    int choice = MainInterface.prompt();
    while (true) {
        MainInterface.performChoice(choice);
        if (choice == 0)
            break;
        
        choice = MainInterface.prompt();
    } 
}