@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof tomdrever.timetable.data.Timetable) {
        tomdrever.timetable.data.Timetable other = ((tomdrever.timetable.data.Timetable) (obj));
        return ((java.util.Objects.equals(other.name, name)) && ((other.days.size()) == (days.size()))) && (other.days.equals(days));
    }
    return super.equals(obj);
}