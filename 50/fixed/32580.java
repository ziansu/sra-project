public static int daysAdd(int m) {
    int days = 0;
    for (int i = 1; i < m; i++) {
        days += smallprojectsgit.datedaycalculate.monthSize[(i - 1)];
    }
    return days;
}