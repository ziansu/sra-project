@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getContext(), "FAB", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(getContext(), com.george.autorunpro.EventAdder.class);
    startActivity(intent);
}