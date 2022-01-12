public int ev12(int p) {
    position = p;
    java.lang.System.out.println("The gods are in your favor as you seem to have found a hot spring with some lovely women to match...");
    java.lang.System.out.println("(1) Approach and see what happens");
    java.lang.System.out.println("(2) Resist the urge");
    choice = u.nextInt();
    switch (choice) {
        case 1 :
            java.lang.System.out.println("You're not quite sure what happened but you feel tired and a bit... sweaty? You definitely feel like slowing down for a bit.");
            speed -= 1;
            position += speed;
            break;
        case 2 :
            java.lang.System.out.println("You feel like much less of a man but somehow feel like you avoided a crisis. You are hasty in your, well, haste.");
            speed += 2;
            position += speed;
            break;
        default :
            java.lang.System.out.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
            position = 0;
            break;
    }
    u.close();
    return position;
}