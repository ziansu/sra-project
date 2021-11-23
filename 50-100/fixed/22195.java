@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    java.lang.String transaction = ((android.widget.TextView) (view.findViewById(R.id.historyItem))).getText().toString();
    java.lang.String answer = transaction.split(" = ")[1];
    if ((controller) != null) {
        controller.updateInput(answer);
    }
}