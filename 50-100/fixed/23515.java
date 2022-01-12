public void Start() {
    java.lang.String go;
    java.lang.System.out.println(" ");
    java.lang.System.out.println("Ready to roll the dice? (Yes/No)");
    java.lang.System.out.print("> ");
    go = keyboard.nextLine();
    if (go.equalsIgnoreCase("Yes")) {
    }else {
        java.lang.System.out.println("Unless you type in 'Yes', we're not going anywhere. Please restart this game");
    }
    Rules rules = new Rules();
    rules.penalty(roll.roll());
}