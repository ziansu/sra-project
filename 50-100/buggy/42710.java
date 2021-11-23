public void askShoot() {
    if ((engine.getPlayer().getAmmo()) == 0) {
        showMessage("You can not shoot. You have no harpoons.");
        return ;
    }else {
        askDirection("shoot");
        java.lang.String[] choices = new java.lang.String[]{ "Left" , "Up" , "Right" , "Down" };
        int direction = displayMenu(choices);
        engine.getPlayer().shoot(direction, engine.getBoard());
        showMessage("\nYou have no harpoons left.");
    }
}