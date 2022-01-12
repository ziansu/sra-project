public void setStatus(structures.Node.Status status) {
    this.status = status;
    if (status == (structures.Node.Status.ACCEPTABLE)) {
        if ((acceptingEndings) == 0) {
            acceptingEndings = 1;
        }
        if ((rejectingEndings) != 0) {
            rejectingEndings = 0;
        }
    }else
        if (status == (structures.Node.Status.REJECTABLE)) {
            if ((rejectingEndings) == 0) {
                rejectingEndings = 1;
            }
            if ((acceptingEndings) != 0) {
                acceptingEndings = 0;
            }
        }
    
}