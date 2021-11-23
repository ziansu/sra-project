@java.lang.Override
public void run() {
    while (!(isdone)) {
        (cur_times)++;
        if ((cur_times) < (times)) {
            ontick();
            try {
                thread.sleep(tick);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                exit(2);
            }
        }else {
            exit(1);
        }
    } 
}