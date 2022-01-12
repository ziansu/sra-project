@java.lang.Override
public int compare(Node o1, Node o2) {
    int num1 = getAdjacents(o1).size();
    int num2 = getAdjacents(o2).size();
    if (num1 < num2) {
        return -1;
    }else
        if (num2 < num1) {
            return 1;
        }else {
            return 0;
        }
    
}