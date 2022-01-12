private static int choiceValidation(int choice) {
    if ((choice > 1) && (choice < 4)) {
        return choice;
    }else {
        return 0;
    }
}