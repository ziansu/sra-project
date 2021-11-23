void applyGlobalContent() {
    if ((currFragment) instanceof dhbw.timetable.navfragments.week.WeekFragment) {
        dhbw.timetable.navfragments.week.WeekFragment frag = ((dhbw.timetable.navfragments.week.WeekFragment) (currFragment));
        frag.applyGlobalContent(false, frag.getView(), this);
    }else
        if ((currFragment) instanceof dhbw.timetable.navfragments.today.TodayFragment) {
            dhbw.timetable.navfragments.today.TodayFragment frag = ((dhbw.timetable.navfragments.today.TodayFragment) (currFragment));
            frag.applyGlobalContent(frag.getView());
        }
    
}