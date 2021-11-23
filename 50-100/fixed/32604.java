public int ev14(int p) {
    position = p;
    java.lang.System.out.println("You stop to rest against a tree and a strange cat approaches you and looks hungry.");
    java.lang.System.out.println("(1) Turn away and walk off");
    java.lang.System.out.println("(2) Look around for something to feed it");
    choice = u.nextInt();
    switch (choice) {
        case 1 :
            java.lang.System.out.println("You feel bad but you didn't have any food for it anyway. You carry on with your life.");
            position += speed;
            break;
        case 2 :
            java.lang.System.out.println("In your attempt to be nice, the cat urinates on your map and proceeds to claw it up. Good job. You run back 5 miles to the rest stop to buy another map.");
            position -= 5;
            break;
        default :
            java.lang.System.out.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
            position = -1;
            break;
    }
    return position;
}