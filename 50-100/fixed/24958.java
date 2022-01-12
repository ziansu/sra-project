@java.lang.Override
public boolean isOutOfRange(int year, int month, int day) {
    if ((selectableDays) != null) {
        return !(isSelectable(year, month, day));
    }
    if (isBeforeMin(year, month, day)) {
        return true;
    }else
        if (isAfterMax(year, month, day)) {
            return true;
        }
    
    return false;
}