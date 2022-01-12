@android.support.annotation.NonNull
public static java.lang.String getPrettyTimeString(java.lang.Double timeSpentAtWork) {
    if (timeSpentAtWork == null) {
        return "No data";
    }
    if (timeSpentAtWork > 0) {
        int hours = ((int) ((timeSpentAtWork / 60) / 60));
        int minutes = ((int) ((timeSpentAtWork / 60) % 60));
        return (((hours + "h") + " ") + minutes) + "m";
    }else
        if (timeSpentAtWork == 0) {
            return "Out of work";
        }else
            return "No data";
        
    
}