private void isTaskArrived() {
    for (int i = 0; i < (tasks.size()); i++) {
        Task temp = tasks.get(i);
        if ((temp.getStartTime()) == (MainScheduler.counter))
            order(temp);
        
    }
}