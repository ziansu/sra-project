@java.lang.Override
public void execute() {
    while ((timeleft) > 0) {
        java.lang.System.out.println(((("Loop " + (name)) + ", time left: ") + (timeleft)));
        pause();
        (timeleft)--;
    } 
    workdone = true;
}