public void checkWinner(int flag) {
    if ((this.userPokemon.getHP()) <= 0) {
        flag = 0;
        java.lang.System.out.println("Game Over...You are out of HP\n");
        java.lang.System.exit(0);
        return ;
    }else
        if ((this.opponentPokemon.getHP()) <= 0) {
            flag = 0;
            java.lang.System.out.println(("You won against " + (this.opponentPokemon.getName())));
            return ;
        }else {
            java.lang.System.out.println("\n 1: Attack \n 2: Use Potion\n 3: Use Pokeball");
        }
    
}