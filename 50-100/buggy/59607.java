private static int paethP(int a, int b, int c) {
    int pa = b - c;
    int pb = a - c;
    int pc = pa + pb;
    pa = lwjPNG.LwjPNG.ab(pa);
    pb = lwjPNG.LwjPNG.ab(pb);
    pc = lwjPNG.LwjPNG.ab(pc);
    return (pa <= pb) && (pa <= pc) ? a : pb <= pc ? b : c;
}