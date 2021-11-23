private void quit() {
    java.lang.System.out.println(Messages.QUIT_MSG);
    while (true) {
        java.lang.String flag = scanner.nextLine();
        if (flag.equalsIgnoreCase("да")) {
            java.lang.System.out.println(Messages.CREDITS);
            java.lang.System.exit(0);
            break;
        }else
            if (flag.equalsIgnoreCase("нет")) {
                break;
            }else {
                java.lang.System.out.println(Messages.INPUT_ERROR);
            }
        
    } 
}