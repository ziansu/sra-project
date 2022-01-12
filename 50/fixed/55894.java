@java.lang.Override
public void call(java.lang.Object result) {
    d.dismiss();
    editedOrDeletedCall.call(null);
    listener.onAddFilterEntry(((java.lang.String) (result)));
}