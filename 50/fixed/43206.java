public void bumpWeek() {
    com.habna.dev.fivethreeone.Models.Lift.WEEK_TYPE nextWeek = getNextWeek();
    if (Lift.WEEK_TYPE.FIVE.equals(nextWeek)) {
        bumpMaxes();
    }
    init(nextWeek, trainingMaxes, true);
}