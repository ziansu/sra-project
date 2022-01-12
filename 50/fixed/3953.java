public void addLines(int linesToAdd) {
    lines += linesToAdd;
    level = ((int) (java.lang.Math.floor(((lines) / 10)))) + 1;
    paintLvl(graphics);
}