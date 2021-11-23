public org.binu.hypersonic.board.CellItem getItemType() {
    if ((param1) == 1)
        return org.binu.hypersonic.board.CellItem.BONUS_RANGE;
    
    if ((param2) == 2)
        return org.binu.hypersonic.board.CellItem.BONUS_BOMBS;
    
    assert false : "They said there would be items!";
    return null;
}