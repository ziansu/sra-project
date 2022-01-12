@java.lang.Override
public void stopVideoTimeCountingThread(java.lang.String roomId) {
    java.util.Iterator<com.benlinus92.synchronize.model.FutureHolder> it = countThreadFutureList.iterator();
    int index = 0;
    while (it.hasNext()) {
        if (it.next().getRoomId().equals(roomId)) {
            cancelThreadTaskByFuture(countThreadFutureList.get(index).getFuture());
            countThreadFutureList.remove(index);
        }else
            index++;
        
    } 
}