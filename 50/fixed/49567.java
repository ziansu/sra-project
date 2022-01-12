@java.lang.Override
public boolean run() {
    counter.addSuccess(1);
    setMessage(net.sf.json.JSONObject.fromObject(message));
    counter.add((-1));
    return true;
}