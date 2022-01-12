@java.lang.Override
public void add() {
    int tail = fibArray.get(((size()) - 2));
    int head = fibArray.get(((size()) - 1));
    fibArray.add((tail + head));
}