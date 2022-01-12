public bms.model.TimeLine getTimeLine(float section, int time) {
    bms.model.TimeLine tl = timelines.get(section);
    if (tl == null) {
        tl = new bms.model.TimeLine(section, time);
        timelines.put(section, tl);
    }
    return tl;
}