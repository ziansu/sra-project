public void test() {
    java.lang.System.out.println(this.getDisco().getFocus());
    java.lang.System.out.println(this.getDisco().getFocus().getGoal());
    java.lang.System.out.println(this.getDisco().getFocus().getParent().getGoal());
    MentalState.Goal child = new MentalState.Goal(this.getDisco().getFocus());
    MentalState.Goal parent = new MentalState.Goal(this.getDisco().getFocus());
}