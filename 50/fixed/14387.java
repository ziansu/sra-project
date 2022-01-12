@java.lang.Override
public utilities.PaxosMsgs.Paxos receive(int who) {
    utilities.PaxosMsgs.Paxos msg = null;
    try {
        msg = msgQueueMap.get(who).take();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return msg;
}