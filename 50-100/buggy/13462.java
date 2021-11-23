public void room9() {
    if (rooms[1][1].getBoss().isAlive()) {
        java.lang.System.out.println("As you enter the room the Troll King appears waiting for you to arrive.");
        java.lang.System.out.println("\"At last you have come! Now come here so I can make soup out of you! Just as I did with that weak little village!\"");
        core.fightEnemy(rooms[1][1].getBoss());
        java.lang.System.out.println("\nAfter killing the Troll King you feel somehow stronger. You leave the cave in search of the other horrible monsters.");
        core.chooseArea();
    }else {
        java.lang.System.out.println("You entered the boss room and find the boss lying dead on the ground, since you already defeated him.");
        core.chooseArea();
    }
}