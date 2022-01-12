public void checkSword() {
    if (contains(LevelArrays.SWORD, currentLevel[y][x])) {
        currentLevel[y][x] = LevelArrays.NORMAL[getIndex(LevelArrays.SWORD, currentLevel[y][x])];
        hasSword = true;
        playSound(R.raw.sword, 1);
    }
    if (hasSword) {
        imgSword.setVisibility(View.VISIBLE);
    }else {
        imgSword.setVisibility(View.INVISIBLE);
    }
}