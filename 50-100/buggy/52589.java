@java.lang.Override
public int get(com.jjoe64.graphview.series.DataPoint data) {
    if ((data.getY()) < 25) {
        return android.graphics.Color.BLUE;
    }else
        if ((data.getY()) < 50) {
            return android.graphics.Color.GREEN;
        }else
            if ((data.getY()) < 75) {
                return android.graphics.Color.RED;
            }else {
                return android.graphics.Color.YELLOW;
            }
        
    
}