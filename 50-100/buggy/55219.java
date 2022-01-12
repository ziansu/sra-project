@java.lang.Override
void walk(double x, double y, int xx, int yy, int dirFacing) {
    super.walk(x, y, xx, yy, dirFacing);
    spriteCounter = ((walkCounter) / 50) % 4;
    if (!(hasWalked))
        (walkCounter)++;
    
    hasWalked = true;
}