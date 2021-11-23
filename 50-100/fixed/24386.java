public void run() {
    try {
        java.lang.String output = "";
        for (int index = outputIndex; index < ((outputIndex) + 7); index++) {
            int val = wireMonitor.getValue(index);
            output = (java.lang.String.valueOf(val)) + output;
        }
        java.lang.System.out.println(output);
    } catch (java.lang.InterruptedException e) {
    }
}