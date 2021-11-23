@java.lang.Override
public void run() {
    java.lang.System.out.println(p);
    while (true) {
        int n = receive();
        if (n == 0) {
            if ((next) != null) {
                next.send(n);
            }
            java.lang.System.out.println("close");
            break;
        }else {
            next = new FastPipe(n);
        }
    } 
}