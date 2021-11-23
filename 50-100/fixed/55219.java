@java.lang.Override
void walk(double x, double y, int xx, int dirFacing) {
    super.walk(x, y, xx, dirFacing);
    spriteCounter = ((walkCounter) / 50) % 4;
    if (!(hasWalked))
        (walkCounter)++;
    
    hasWalked = true;
}