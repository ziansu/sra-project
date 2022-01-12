public int overallScore() {
    int s;
    if ((score1) < (score2))
        s = score2;
    else
        s = score1;
    
    if (s > (score3))
        s = score3;
    
    s = (((score1) + (score2)) + (score3)) - s;
    return s;
}