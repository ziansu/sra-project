public void insert(int priority) {
    for (int hole = ++(numQueueItems); (hole > 1) && (priority > (queue[(hole / 2)])); hole /= 2) {
        queue[hole] = queue[(hole / 2)];
    }
    queue[hole] = priority;
}