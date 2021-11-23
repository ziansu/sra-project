@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            listener.onInputDone(new java.lang.String("男"));
            break;
        case 1 :
            listener.onInputDone(new java.lang.String("女"));
            break;
    }
}