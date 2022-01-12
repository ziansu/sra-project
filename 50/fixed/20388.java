public void setSelected(int large, int small) {
    edu.neu.madcourse.hangxu.Tile tile = smallTiles[large][small];
    tile.setColorMode(edu.neu.madcourse.hangxu.GameFragment.COLOR_SELECTED);
}