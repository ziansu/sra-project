@java.lang.Override
public void run() {
    try {
        synchronized(this) {
            if (private_mailbox.isEmpty())
                this.wait();
            
        }
        while (!(private_mailbox.isEmpty())) {
            processMessage();
        } 
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}