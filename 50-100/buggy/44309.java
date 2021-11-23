public void deleteTimeInterval(john.my7.TimeInterval interval) {
    if ((interval.getStart().compareTo(new john.my7.Time(0, 0))) == 0)
        firstIsNight = !(firstIsNight);
    
    if ((intervals.size()) == 1)
        return ;
    
    intervals.remove(interval);
    correctIntervals();
}