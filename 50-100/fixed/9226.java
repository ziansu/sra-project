public int ev3(int p) {
    position = p;
    java.lang.System.out.println("There is a white rabbit in the road, it looks rather fluffy and cute");
    java.lang.System.out.println("(1) Reach out and pet it ");
    java.lang.System.out.println("(2) Ignore it and move on ");
    choice = u.nextInt();
    switch (choice) {
        case 1 :
            java.lang.System.out.println(" IT IS THE RABBIT!!!");
            java.lang.System.out.println("You died horribly, it was gruesome");
            position = -1;
            break;
        case 2 :
            java.lang.System.out.println("Probably a good idea, it's better to avoid cuteness");
            position += speed;
            break;
        default :
            java.lang.System.out.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
            position = -1;
            break;
    }
    return position;
}