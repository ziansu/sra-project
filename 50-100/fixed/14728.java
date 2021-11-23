@java.lang.Override
public int compare(javafx.util.Pair<java.lang.Integer, java.lang.String> o1, javafx.util.Pair<java.lang.Integer, java.lang.String> o2) {
    if ((o1.getKey()) > (o2.getKey())) {
        return -1;
    }else
        if (o1.getKey().equals(o2.getKey())) {
            return o1.getValue().compareTo(o2.getValue());
        }else {
            return 1;
        }
    
}