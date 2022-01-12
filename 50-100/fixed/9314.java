@java.lang.Override
public int compare(com.adm.scheduler.message.Message o1, com.adm.scheduler.message.Message o2) {
    if ((priority.get(o1.getGroup())) != null)
        return 1;
    
    if ((priority.get(o2.getGroup())) != null)
        return -1;
    
    return 1;
}