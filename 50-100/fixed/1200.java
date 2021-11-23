@java.lang.Override
public java.lang.String toString() {
    java.lang.String returnString = "";
    for (com.arjunkalburgi.assignment1.DayOfTheWeek d : this) {
        if (d.isSeletected()) {
            returnString = (returnString + (d.getName())) + ", ";
        }
    }
    return returnString;
}