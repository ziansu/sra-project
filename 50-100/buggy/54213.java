public void stockClicked() {
    java.lang.System.out.println("stock clicked");
    display.unselect();
    if ((!(display.isWasteSelected())) && (!(display.isPileSelected()))) {
        client.makeMove(0, 0, 1);
    }
}