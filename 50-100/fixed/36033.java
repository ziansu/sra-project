public static double get(uk.co.brotherlogic.mdb.record.Record rec) throws java.sql.SQLException {
    double scoreVal = 0.0;
    int count = 0;
    for (uk.co.brotherlogic.mdb.User user : uk.co.brotherlogic.mdb.User.getUsers()) {
        double score = uk.co.brotherlogic.mdb.record.RecordScore.get(rec, user);
        if (score >= 0) {
            scoreVal += score;
            count++;
        }
    }
    if (count > 0)
        return scoreVal / count;
    else
        return 0.0;
    
}