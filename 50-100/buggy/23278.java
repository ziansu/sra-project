@java.lang.Override
public int compare(com.inhavok.fallen.utility.Pathfinder.Node o1, com.inhavok.fallen.utility.Pathfinder.Node o2) {
    if ((o1.getF()) < (o2.getF())) {
        return 1;
    }else
        if ((o1.getF()) > (o2.getF())) {
            return 2;
        }
    
    return 0;
}