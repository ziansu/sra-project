public Intermediary.LinkedEntity search(int n) {
    Intermediary.LinkedEntity runner = head;
    if ((runner.equals(null)) == false) {
        for (int i = 0; i < n; i++) {
            if ((runner.next.equals(null)) == false)
                runner = runner.next;
            else
                return null;
            
        }
        return runner;
    }
    return null;
}