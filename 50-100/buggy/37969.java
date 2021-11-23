@java.lang.Override
public void viewAllPages() {
    if (this.verifyPassword()) {
        java.lang.System.out.println("Showing notebook pages:");
        for (int index = 0; index < (pages.length); index++) {
            this.pages[(index - 1)].viewPage();
        }
    }
}