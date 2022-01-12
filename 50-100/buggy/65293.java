@java.lang.Override
public void run() {
    com.zf3zzzx.utils.Utils.log("Vote Thread Start");
    new java.lang.Thread(new com.zf3zzzx.utils.HackVote.SpeedTest()).start();
    (thread)++;
    while (((run) & ((id) != 0)) & ((time) != 0)) {
        state = voteOnce(id);
        (time)--;
    } 
    run = false;
    (thread)--;
    com.zf3zzzx.utils.Utils.log("Vote Thread Stop");
}