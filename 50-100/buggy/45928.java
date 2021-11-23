@java.lang.Override
public void setChoice() {
    int computerChoice = rollRandomNumber();
    java.lang.System.out.println(("GOT THIS FAR, computer random rolled is " + computerChoice));
    switch (computerChoice) {
        case 0 :
            choice = "Rock";
        case 1 :
            choice = "Paper";
        case 2 :
            choice = "Scissor";
        default :
            choice = null;
    }
}