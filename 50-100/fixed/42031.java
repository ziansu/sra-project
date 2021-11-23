@java.lang.Override
public void add(java.lang.Object object) {
    if (object == null) {
        return ;
    }
    if (object instanceof java.lang.String) {
        addString(((java.lang.String) (object)));
    }else
        if (object instanceof com.company.models.Task) {
            addTask(((com.company.models.Task) (object)));
        }else {
            addTask(((java.util.List<com.company.models.Task>) (object)));
        }
    
}