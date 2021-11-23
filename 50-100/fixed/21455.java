@java.lang.Override
public boolean match(M msg) {
    boolean res = false;
    if ((msg == null) || ((expectedQueue.peek()) == null)) {
        return res;
    }
    res = (expectedQueue.peek().equals(msg)) ? true : false;
    if (res) {
        expectedQueue.poll();
    }
    return res;
}