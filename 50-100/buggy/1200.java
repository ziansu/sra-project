@java.lang.Override
public java.lang.String toString() {
    java.lang.String returnString = "";
    for (com.arjunkalburgi.assignment1.DayOfTheWeek d : this) {
        if (d.isSeletected()) {
            returnString = (returnString + (d.getName())) + ", ";
        }
    }
    android.util.Log.d(com.arjunkalburgi.assignment1.DaysOfTheWeek.TAG, ("for each loop " + (this.get(0).getName())));
    return returnString;
}