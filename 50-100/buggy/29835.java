public void changeTime(int dealy, boolean anticipate) {
    if (anticipate) {
        second -= dealy;
    }else {
        second += dealy;
    }
    models.Remain secondRemain = logic.Utility.calculateRemains(second);
    second = secondRemain.getValue();
    minute += secondRemain.getRemain();
    models.Remain minuteRemain = logic.Utility.calculateRemains(minute);
    minute = minuteRemain.getValue();
    hour += minuteRemain.getRemain();
}