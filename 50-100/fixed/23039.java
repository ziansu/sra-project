public void addSelection(nl.tudelft.bejeweled.sprite.Jewel jewel) {
    selection.add(jewel);
    if ((selection.size()) == 2) {
        if (moveWithinDomain(selection.get(0), selection.get(1))) {
            java.lang.System.out.println("Swapping jewels");
            swapJewel(selection.get(0), selection.get(1));
            int comboCount = checkBoardCombos();
            java.lang.System.out.println(("Combo Jewels on board: " + comboCount));
        }
        selection.clear();
    }
}