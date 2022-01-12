@java.lang.Override
public void run() {
    while (!(isdone)) {
        (cur_times)++;
        if ((cur_times) < (times)) {
            ontick();
            sleep(tick);
        }else {
            exit(1);
        }
    } 
}