@java.lang.Override
public void printScreen() {
    for (int i = 0; i < (numIsland); ++i) {
        islands[i].addActionListener(manager);
    }
}