public static fr.ralala.worktime.models.DayType compute(int value) {
    switch (value) {
        case 0 :
            return fr.ralala.worktime.models.DayType.AT_WORK;
        case 1 :
            return fr.ralala.worktime.models.DayType.PUBLIC_HOLIDAY;
        case 2 :
            return fr.ralala.worktime.models.DayType.HOLIDAY;
        case 3 :
            return fr.ralala.worktime.models.DayType.SICKNESS;
        case 4 :
            return fr.ralala.worktime.models.DayType.UNPAID;
        default :
            return fr.ralala.worktime.models.DayType.ERROR;
    }
}