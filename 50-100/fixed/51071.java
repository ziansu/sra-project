public int getSubAcbInWeekContest() {
    if ((inTeamStatus) != (entity.User.V_TEAM))
        return 0;
    
    switch (inTeamLv) {
        case -1 :
            return 50;
        case 0 :
            return 50;
        case 1 :
            return 100;
        case 2 :
            return 150;
        case 3 :
            return 200;
        case 4 :
            return 300;
        case 5 :
            return 400;
        case 6 :
            return 500;
        default :
            return 0;
    }
}