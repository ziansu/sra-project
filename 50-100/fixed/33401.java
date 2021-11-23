public Intermediary.LinkedEntity search(int n) {
    Intermediary.LinkedEntity runner = head;
    if (runner != null) {
        for (int i = 0; i < n; i++) {
            if ((runner.next) != null)
                runner = runner.next;
            else
                return null;
            
        }
        return runner;
    }
    return null;
}