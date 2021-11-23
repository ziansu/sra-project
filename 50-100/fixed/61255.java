@java.lang.Override
public void run() {
    if ((location) == null) {
        location = target.getLocation();
    }else
        if (!(org.bitbucket.ucchy.fnafim.task.FreddyItemWaitTask.isSameLocation(location, target.getLocation()))) {
            session.onFreddyItemGet(target.getName());
            isEnd = true;
            end();
        }
    
}