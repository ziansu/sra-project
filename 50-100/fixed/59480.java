int lerpColor(int[] c, float amt) {
    int index = ((int) (c.length)) * amt;
    return lerpColor(c[index], c[((index + 1) < (c.length) ? index + 1 : (c.length) - 1)], ((amt * ((c.length) - 1)) - index));
}