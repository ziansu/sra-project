@java.lang.Override
public void onTerminating() {
    if (((this.printStream) != (java.lang.System.out)) && ((this.printStream) != (java.lang.System.err))) {
        this.printStream.close();
    }
    kieker.monitoring.writernew.print.PrintStreamWriter.LOG.info(((this.getClass().getName()) + " shutting down."));
}