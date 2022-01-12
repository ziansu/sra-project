@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent iin = getIntent();
    android.os.Bundle b = iin.getExtras();
    if (b != null) {
        inputValues.desirialise(((java.lang.String) (b.get("InputValues"))));
    }
    sendInitToServer();
}