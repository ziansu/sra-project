public void push(java.util.List<jp.co.worksap.global.TravellingSalesman.Coordinate> stack, jp.co.worksap.global.TravellingSalesman.Coordinate coordinate) {
    int i;
    for (i = 0; i < (stack.size()); i++) {
        if ((coordinate.getTotalValue()) <= (stack.get(i).getTotalValue())) {
            break;
        }
    }
    stack.add(i, coordinate);
}