@java.lang.Override
public int compare(ge.edu.freeuni.sdp.xo.achiev.FakeDBObject arg0, ge.edu.freeuni.sdp.xo.achiev.FakeDBObject arg1) {
    int scoreFirst = arg0.getScore();
    int scoreSecond = arg1.getScore();
    if (scoreFirst == scoreSecond)
        return 0;
    else
        if (scoreFirst > scoreSecond)
            return 1;
        
    
    return -1;
}