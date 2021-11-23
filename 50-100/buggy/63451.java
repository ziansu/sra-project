public void drawNum(int number, int i, int j) {
    if (((((number < 0) || (number > 9)) || (i < 0)) || (j < 0)) || (this.bits[((j * 9) + i)])) {
        return ;
    }
    this.number = number;
    this.tmp[((j * 9) + i)] = this.number;
}