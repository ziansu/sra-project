@java.lang.Override
public void run() {
    java.lang.System.out.println(p);
    while (true) {
        int n = receive();
        if (n == 0) {
            if ((next) != null)
                java.lang.System.out.println("close");
            
            next.send(n);
            break;
        }else {
            next = new FastPipe(n);
        }
    } 
}