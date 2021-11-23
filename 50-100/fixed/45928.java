@java.lang.Override
public void setChoice() {
    int computerChoice = rollRandomNumber();
    switch (computerChoice) {
        case 0 :
            choice = "Rock";
            break;
        case 1 :
            choice = "Paper";
            break;
        case 2 :
            choice = "Scissor";
            break;
        default :
            choice = null;
            break;
    }
}