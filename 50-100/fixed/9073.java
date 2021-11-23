public void delete(int key) {
    java.util.Iterator<QueueEntity> iter = info.iterator();
    while (iter.hasNext()) {
        QueueEntity it = iter.next();
        if ((it.ID) == key) {
            info.remove(it);
            break;
        }
    } 
}