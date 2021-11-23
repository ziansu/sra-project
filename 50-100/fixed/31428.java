@java.lang.Override
public int compare(org.prop4j.Literal arg0, org.prop4j.Literal arg1) {
    if ((arg0.positive) == (arg1.positive)) {
        return ((java.lang.String) (arg0.var)).compareTo(((java.lang.String) (arg1.var)));
    }else
        if (arg0.positive) {
            return -1;
        }else {
            return 1;
        }
    
}