private int calAgeInMonths(com.xswad.zhenyu.babyrecordapplication.Models.Age age) {
    int year = java.lang.Math.abs(age.getYears());
    int months = age.getMonths();
    int ageInMonths = months;
    if (year >= 1) {
        ageInMonths = ageInMonths + (12 * year);
    }
    return ageInMonths;
}