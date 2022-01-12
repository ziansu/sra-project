@java.lang.Override
public int compare(com.example.nickozoulis.teamproj.domain.Referee lRef, com.example.nickozoulis.teamproj.domain.Referee rRef) {
    int res = firstClassOrdering(lRef, rRef);
    if (res == 0) {
        res = secondClassOrdering(lRef, rRef);
        if (res == 0) {
            res = thirdClassOrdering(lRef, rRef);
        }
    }
    return res;
}