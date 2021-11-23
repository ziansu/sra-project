public void clear() {
    table = new ru.spbau.mit.java.fall2017.containers.LinkedList[capacity];
    for (int i = 0; i < (table.length); i++) {
        table[i] = new ru.spbau.mit.java.fall2017.containers.LinkedList();
    }
    size = 0;
}