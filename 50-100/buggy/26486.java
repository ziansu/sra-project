public void execute_next() throws exception.ActionEx, exception.MouvementEx, exception.UnreachableCase {
    java.lang.System.out.println("Ich bin in execute-next");
    if (this.list_robot.get(this.ind_ex).get_activable()) {
        java.lang.System.out.println("Ich bin in execute-next Ich bin in if");
        this.ready = false;
        this.list_robot.get(this.ind_ex).execute();
    }
    this.increment_ind();
}