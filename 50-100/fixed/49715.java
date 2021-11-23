private static java.util.Map<net.parostroj.timetable.model.changes.SpecialTrainTimeIntervalList.Type, java.lang.String> getTilDescs() {
    java.util.Map<net.parostroj.timetable.model.changes.SpecialTrainTimeIntervalList.Type, java.lang.String> map = new java.util.EnumMap(SpecialTrainTimeIntervalList.Type.class);
    map.put(SpecialTrainTimeIntervalList.Type.ADDED, null);
    map.put(SpecialTrainTimeIntervalList.Type.MOVED, "train_moved");
    map.put(SpecialTrainTimeIntervalList.Type.RECALCULATE, "train_recalculated");
    map.put(SpecialTrainTimeIntervalList.Type.SPEED, "train_speed");
    map.put(SpecialTrainTimeIntervalList.Type.STOP_TIME, "train_stop_time");
    map.put(SpecialTrainTimeIntervalList.Type.TRACK, "train_track");
    return map;
}