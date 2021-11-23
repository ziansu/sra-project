@java.lang.Override
public tomdrever.timetable.data.Timetable cloneItem() {
    tomdrever.timetable.data.Timetable timetable = new tomdrever.timetable.data.Timetable();
    timetable.id = id;
    timetable.name = name;
    timetable.index = index;
    timetable.description = description;
    for (int i = 0; i < (days.size()); i++) {
        timetable.days.add(days.get(i).cloneItem());
    }
    return timetable;
}