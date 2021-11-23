@java.lang.Override
public java.lang.String toString() {
    return type.isWeekendDay() ? java.lang.String.valueOf(date.get(java.util.Calendar.DAY_OF_MONTH)) : (("[32m" + "\t") + (java.lang.String.valueOf(date.get(java.util.Calendar.DAY_OF_MONTH)))) + "[30m";
}