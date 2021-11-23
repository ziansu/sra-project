@java.lang.Override
public int compare(main.java.edu.asu.cst316.highscore.PlayerRecord pr1, main.java.edu.asu.cst316.highscore.PlayerRecord pr2) {
    return (pr1.getScore()) > (pr2.getScore()) ? 1 : -1;
}