public static void playAgain() {
    java.lang.System.out.println("Do You Want To Give It Another Go?   \n1. Yea, I\'m Game \n2. Nah, Let\'s Try Something Else");
    int response = cs1.Keyboard.readInt();
    if (response == 1) {
        War.turns = 0;
        War.winners = new java.util.ArrayList<Player>();
        War.main(null);
    }else
        if (response == 2) {
            Woo.main(null);
        }else {
            java.lang.System.out.println("I don't understand, so I'll ask again");
            War.playAgain();
        }
    
}