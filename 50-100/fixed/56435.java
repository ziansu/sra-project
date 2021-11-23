private void repeat() {
    java.lang.System.out.println("Do you want to keep going?");
    java.lang.System.out.println("Yes to continue. No to quit.\n");
    java.lang.System.out.println("Type \'menu\' to return to the menu \nor \'home\' to go back and choose a different problem");
    yesOrNo = userInput.nextLine();
    if (yesOrNo.equalsIgnoreCase("yes"))
        decide();
    
    if (yesOrNo.equalsIgnoreCase("no"))
        return ;
    
    if (yesOrNo.equalsIgnoreCase("menu"))
        decide();
    
    if (yesOrNo.equalsIgnoreCase("home"))
        userDecision.startUp();
    
}