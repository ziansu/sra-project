@java.lang.Override
public int compare(com.starbase.starteam.Label arg0, com.starbase.starteam.Label arg1) {
    if ((arg0.getTime().getLongValue()) > (arg1.getTime().getLongValue())) {
        return 1;
    }else
        if ((arg0.getTime().getLongValue()) < (arg1.getTime().getLongValue())) {
            return -1;
        }
    
    return arg0.getName().compareTo(arg1.getName());
}