@java.lang.Override
public void onCompleted(java.lang.String result) {
    tv.append(makeLog((("\n" + "Import completed--->") + result)));
    showDbMsg(result);
}