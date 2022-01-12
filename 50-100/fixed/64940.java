public java.util.ArrayList<com.example.andrea.starship_battle.model.CasellaPosition> createEnemyBattlefield(java.util.ArrayList<com.example.andrea.starship_battle.model.CasellaPosition> casellaPositionArrayList) {
    for (int row = 0; row < 8; row++) {
        for (int column = 0; column < 8; column++) {
            com.example.andrea.starship_battle.model.CasellaPosition casellaPosition = new com.example.andrea.starship_battle.model.CasellaPosition();
            casellaPosition.setImageName("space");
        }
    }
    return casellaPositionArrayList;
}