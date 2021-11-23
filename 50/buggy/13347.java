public void renewwh(int tempwidth, int tempheight) {
    mywidth = tempwidth;
    myheight = tempheight;
    if (!(flag4codebook)) {
        codebook = new Codebook(this);
    }
}