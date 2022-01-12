@java.lang.Override
public void onCalled(java.util.ArrayList<com.johnsimon.payback.core.Contact> contacts) {
    link(data, contacts);
    output.broadcast(data);
}