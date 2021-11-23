@java.lang.Override
public void onCalled(java.util.ArrayList<com.johnsimon.payback.core.Contact> contacts) {
    com.johnsimon.payback.util.DataLinker.link(data, contacts);
    output.broadcast(data);
}