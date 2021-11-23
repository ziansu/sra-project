public boolean equals(java.lang.Object o) {
    boolean answer = false;
    if (o instanceof edu.aca.dbpmla.svm.global_local.Branch) {
        if (this.address.equals(((edu.aca.dbpmla.svm.global_local.Branch) (o)).address))
            answer = true;
        
    }
    return answer;
}