@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.String input = _input.take();
            synchronized(this) {
                if (input.equals(aya.Aya.QUIT)) {
                    break;
                }
                long startTime = java.lang.System.currentTimeMillis();
                aya.Aya._instance.run(input);
                _lastInputRunTime = (java.lang.System.currentTimeMillis()) - startTime;
                notify();
            }
        } catch (java.lang.InterruptedException e) {
            java.lang.System.err.println(("Aya interupted: " + e));
        }
    } 
}