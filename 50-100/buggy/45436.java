private com.battleship.Ship[] initializeShipCreation() {
    com.battleship.Ship[] battleships = createShips(com.battleship.GameLogic.BATTLESHIP_SIZE, com.battleship.GameLogic.BATTLESHIP_COUNT);
    com.battleship.Ship[] cruisers = createShips(com.battleship.GameLogic.CRUISER_SIZE, com.battleship.GameLogic.CRUISER_COUNT);
    com.battleship.Ship[] destroyers = createShips(com.battleship.GameLogic.DESTROYER_SIZE, com.battleship.GameLogic.DESTROYER_COUNT);
    com.battleship.Ship[] submarines = createShips(com.battleship.GameLogic.SUBMARINE_SIZE, com.battleship.GameLogic.SUBMARINE_COUNT);
    com.battleship.Ship[] ships = concatShipArray(battleships, cruisers);
    ships = concatShipArray(ships, destroyers);
    ships = concatShipArray(ships, submarines);
    return ships;
}