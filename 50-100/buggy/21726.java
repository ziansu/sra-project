@java.lang.Override
public boolean check() {
    boolean ret = true;
    for (com.htc.eleven.autotest.Condition c : mConditions) {
        ret = c.judge();
        if (!ret) {
            err = c;
            result = "Failed";
            break;
        }
    }
    result = "Passed";
    return ret;
}