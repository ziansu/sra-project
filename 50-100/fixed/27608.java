public int ev15(int p) {
    position = p;
    java.lang.System.out.println("You found a new pair of shoes, they have a nice set of wings painted on the side");
    java.lang.System.out.println("(1) Put them on");
    java.lang.System.out.println("(2) Leave them there and move on");
    choice = u.nextInt();
    switch (choice) {
        case 1 :
            java.lang.System.out.println("You should probably have thought this through first but luckily for you they are Hermes\'s boots, Gotta go fast");
            speed += 7;
            position += speed;
            break;
        case 2 :
            java.lang.System.out.println("THEY HAD WINGS!! WINGS!!!!... and YOU!... YOU turned that shit down!!");
            position += speed;
            break;
        default :
            java.lang.System.out.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
            position = -1;
            break;
    }
    return position;
}