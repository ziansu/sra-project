public static void main(java.lang.String[] args) {
    Hotline game = new Hotline();
    int encounters = 0;
    while (encounters < (Hotline.MAX_ENCOUNTERS)) {
        if (!(game.battle()))
            break;
        
        encounters++;
        java.lang.System.out.println();
    } 
    java.lang.System.out.println("Game over.");
}