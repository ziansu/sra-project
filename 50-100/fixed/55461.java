@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
    nl.dke.boardgame.display.game.Hexagon hex = draw.getHexagon(mouseEvent.getPoint());
    java.lang.System.out.println(("Pressed on: " + hex));
    try {
        if (processor.accepting()) {
            processor.in(hex.getRow(), hex.getColumn());
        }
    } catch (nl.dke.boardgame.exceptions.NotAcceptingInputException e) {
        e.printStackTrace();
    }
}