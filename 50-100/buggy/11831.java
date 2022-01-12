@java.lang.Override
public int compare(com.example.nickozoulis.teamproj.domain.Referee lRef, com.example.nickozoulis.teamproj.domain.Referee rRef) {
    int res = firstClassOrdering(lRef, rRef);
    android.util.Log.i("INFO", "firstClassOrdering");
    if (res == 0) {
        res = secondClassOrdering(lRef, rRef);
        android.util.Log.i("INFO", "SecondClassOrdering");
        if (res == 0) {
            res = thirdClassOrdering(lRef, rRef);
            android.util.Log.i("INFO", "thirdClassOrdering");
        }
    }
    return res;
}