@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition o) {
    int rowDiff = (row) - (o.row);
    int columnDiff = (column) - (o.column);
    if (rowDiff > 0) {
        return 1;
    }else
        if (rowDiff < 0) {
            return -1;
        }else {
            if (columnDiff > 0) {
                return 1;
            }else
                if (columnDiff < 0) {
                    return -1;
                }else {
                    return 0;
                }
            
        }
    
}