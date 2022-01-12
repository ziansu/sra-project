@java.lang.Override
public void onClick(android.view.View v) {
    com.example.dotua.goldendictbridge.SharedFunction.sendMessage(context, ((android.widget.TextView) (v)).getText().toString());
}