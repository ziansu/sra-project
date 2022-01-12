@android.support.annotation.NonNull
public static java.lang.String getPrettyTimeString(double timeSpentAtWork) {
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