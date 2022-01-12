@java.lang.Override
public void gotResult(int responseCode, java.lang.String responseDesc) {
    result[0] = responseCode == 0;
}