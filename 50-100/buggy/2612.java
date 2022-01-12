@java.lang.Override
public void tick() {
    for (java.util.Iterator<com.wecanteven.Models.ModelTime.TimedObject> iterator = alertables.iterator(); iterator.hasNext();) {
        com.wecanteven.Models.ModelTime.TimedObject object = iterator.next();
        java.lang.System.out.println("alertable ticks");
        if (object.decrement()) {
            alertables.remove(object);
        }
    }
    for (java.util.Iterator<com.wecanteven.Models.ModelTime.Tickable> iterator = tickables.iterator(); iterator.hasNext();) {
        com.wecanteven.Models.ModelTime.Tickable object = iterator.next();
        object.tick();
    }
}