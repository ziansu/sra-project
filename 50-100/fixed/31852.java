public at.footballapp.captainandroid.footballapp.pkgData.Match getMatch(java.sql.Date date) {
    int i;
    boolean objectFound = false;
    for (i = 0; !objectFound; i++)
        if (date.equals(matches.get(i).getDate()))
            objectFound = true;
        
    
    return matches.get((i - 1));
}