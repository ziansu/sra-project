public void displayIntro() {
    io.zipcoder.zealotscasino.UserInput.display("--------------------Zealot's Casino--------------------");
    double startWallet = io.zipcoder.zealotscasino.UserInput.getDoubleInput("How much money do you want to start your wallet with?");
    try {
        java.lang.System.out.println(startWallet);
        player = new io.zipcoder.zealotscasino.Player(startWallet);
    } catch (java.lang.IllegalArgumentException e) {
        io.zipcoder.zealotscasino.UserInput.display("Must have at least $20 to enter Zealot's Casino.");
        displayIntro();
    }
}