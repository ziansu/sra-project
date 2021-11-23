@java.lang.Override
public void pressAction(int buttonID, boolean isLeft) {
    ca.afroman.client.ClientGame.instance().input().mouseLeft.isPressedFiltered();
    if ((ca.afroman.client.ClientGame.instance().getCurrentLevel()) != null) {
        switch (buttonID) {
            case 500 :
                java.lang.System.out.println("Caut");
                grid.setGridSize(grid.getGridSize().getNext());
                break;
        }
        updateButtons();
    }
}