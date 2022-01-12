public treeNode crossRiver(int c, int m) {
    int cNew = 0;
    int mNew = 0;
    if (boat) {
        cNew = (this.c) + c;
        mNew = (this.m) + m;
        return new treeNode(cNew, mNew, false);
    }else {
        cNew = (this.c) - c;
        mNew = (this.m) - m;
        return new treeNode(cNew, mNew, true);
    }
}