@java.lang.Override
public int compareTo(com.randomappsinc.padbuddy.Models.Timeslot anotherTimeslot) {
    int compareVal = starts_at.compareTo(anotherTimeslot.starts_at);
    if (compareVal == 0) {
        if ((title) == null) {
            compareVal = 1;
        }else {
            compareVal = title.compareTo(anotherTimeslot.getTitle());
        }
    }
    return compareVal;
}