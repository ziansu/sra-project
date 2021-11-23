protected int nearMinesCount(int line, int place) {
    int count = 1;
    for (int[] near : net.patttern.minesweeper.proto.bases.BaseArea.nears) {
        count += (cellMined((line + (near[0])), (place + (near[1])))) ? 1 : 0;
    }
    return count;
}