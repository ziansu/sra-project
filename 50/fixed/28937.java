@java.lang.Override
public int compare(blackclient.Point o1, blackclient.Point o2) {
    int score1 = o1.score;
    int score2 = o2.score;
    if (score1 > score2)
        return -1;
    else
        if (score1 == score2)
            return 0;
        else
            return 1;
        
    
}