@java.lang.Override
public boolean run() {
    counter.addSuccess(1);
    setMessage(getJsonObject(message));
    counter.add((-1));
    return true;
}