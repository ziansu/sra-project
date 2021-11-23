public void insertChip(int columnPosition, CS151.HW3.Player player) {
    CS151.HW3.Chip newChip = player.getChip();
    structure[columnPosition][positionForInsert[columnPosition]] = newChip;
    positionForInsert[columnPosition] = (positionForInsert[columnPosition]) + 1;
}