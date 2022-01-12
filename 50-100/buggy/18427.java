@java.lang.Override
public void showAreaCard(Controller.Area area, Enums.Player playerName) throws java.lang.Exception {
    if (area == (Area.discard))
        fireSelectCardRequest((((((("player " + (activePlayer)) + " ") + (area.name())) + " area - size : ") + (players.get(playerName).getAreaCard(area).size())) + "cards"), 0, players.get(playerName).getAreaCard(area), true);
    
}