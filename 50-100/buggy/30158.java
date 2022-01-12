@java.lang.Override
public int compare(com.company.Hand o1, com.company.Hand o2) {
    if ((o1.getHandOfCards().get(0).getRankValue()) > (o2.getHandOfCards().get(0).getRankValue())) {
        return 1;
    }
    return -1;
}