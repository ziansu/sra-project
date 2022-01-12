@java.lang.Override
public void run() {
    com.zf3zzzx.utils.Utils.log("Vote Thread Start");
    (thread)++;
    while (((run) & ((id) != 0)) & ((time) != 0)) {
        (time)--;
        state = voteOnce(id);
    } 
    run = false;
    (thread)--;
    com.zf3zzzx.utils.Utils.log("Vote Thread Stop");
}