@java.lang.Override
public boolean isPass() {
    boolean pass = false;
    if ((averageScore()) > 50) {
        pass = true;
    }
    return pass;
}