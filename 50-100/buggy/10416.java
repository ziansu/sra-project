public void next() {
    final net.teamfruit.signpic.manager.scan.Scanner scanner = this.current.getScanner(null);
    if (scanner != null) {
        if ((scanner.getState()) == (net.teamfruit.signpic.manager.scan.Scanner.ScanState.DONE)) {
            final net.teamfruit.signpic.manager.scan.ScanManager.ScanTask task = this.queue.poll();
            if (task != null) {
                this.current = task;
                scan(task);
            }else
                this.current = null;
            
        }
    }
}