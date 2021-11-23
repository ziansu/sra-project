public void insert(int priority) {
    int hole = ++(numQueueItems);
    for (; (hole > 1) && (priority > (queue[(hole / 2)])); hole /= 2) {
        queue[hole] = queue[(hole / 2)];
    }
    queue[hole] = priority;
}