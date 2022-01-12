@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    counter.setValue(java.lang.Integer.valueOf(input.getText().toString()));
    listener.added(counter.getKey());
    counter.load(counter.getKey());
}