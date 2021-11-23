@java.lang.Override
public boolean run() {
    counter.addSuccess(1);
    counter.add((-1));
    setMessage(getJsonObject(message));
    return true;
}