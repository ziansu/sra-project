@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (!(super.equals(obj)))
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    if (org.ow2.proactive.scheduler.task.internal.InternalTask.class.isAssignableFrom(obj.getClass())) {
        return ((org.ow2.proactive.scheduler.task.internal.InternalTask) (obj)).getId().equals(getId());
    }else {
        return false;
    }
}