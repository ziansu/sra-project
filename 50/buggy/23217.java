@java.lang.Override
public int compare(fr.ralala.worktime.models.DayEntry a, fr.ralala.worktime.models.DayEntry b) {
    if ((a.isRecurrence()) || (b.isRecurrence()))
        return -1;
    
    return a.getDay().compareTo(b.getDay());
}