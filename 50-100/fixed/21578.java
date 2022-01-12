@java.lang.Override
public int compare(com.capitalone.dashboard.model.Feature f, com.capitalone.dashboard.model.Feature ff) {
    if ((f.getsEpicID().compareToIgnoreCase(ff.getsEpicID())) <= (-1)) {
        return -1;
    }else
        if ((f.getsEpicID().compareToIgnoreCase(ff.getsEpicID())) >= 1) {
            return 1;
        }else {
            return 0;
        }
    
}