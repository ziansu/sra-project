@java.lang.Override
public void onMessage(java.util.Map<java.lang.String, java.lang.String> data) {
    if ((entries.size()) >= lines) {
        connector.getEbus().removeAll();
        result.setResult(entries);
    }
    if (data.get(MessageEvent.SENDER).equals(user)) {
        entries.add(data.get(MessageEvent.MESSAGE));
    }
}