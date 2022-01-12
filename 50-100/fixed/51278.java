public java.lang.String getHand() {
    java.lang.String hand = "";
    int choice = ((int) (java.lang.Math.floor((((java.lang.Math.random()) * 3) + 1))));
    switch (choice) {
        case 1 :
            hand = "rock";
            emoji2 = Resource.Emoji.rock;
            break;
        case 2 :
            hand = "paper";
            emoji2 = Resource.Emoji.paper;
            break;
        case 3 :
            hand = "scissors";
            emoji2 = Resource.Emoji.scissors;
            break;
        default :
            hand = "no hand";
            break;
    }
    return hand;
}