public int listen() {
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    lock.acquire();
    if ((nachos.threads.Communicator.num_speaker) == 0) {
        (nachos.threads.Communicator.num_litener)++;
        litener.sleep();
        (nachos.threads.Communicator.num_litener)--;
    }else {
        speaker.wake();
        litener.sleep();
    }
    lock.release();
    nachos.threads.Machine.interrupt().restore(intStatus);
    return queue.poll();
}