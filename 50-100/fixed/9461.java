private void nextLevel() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    net.liquidpineapple.pang.gui.Board currentBoard = net.liquidpineapple.pang.Application.getBoard();
    net.liquidpineapple.pang.screens.Screen newScreen = null;
    if (currentBoard.getLevels().hasNext()) {
        newScreen = ((net.liquidpineapple.pang.screens.Screen) (currentBoard.getLevels().next()));
    }else {
        newScreen = new net.liquidpineapple.pang.screens.WinScreen();
    }
    currentBoard.changeScreen(newScreen);
}