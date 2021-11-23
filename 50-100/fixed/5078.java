@java.lang.Override
public void onComplete(android.os.Bundle bundle) {
    android.view.LayoutInflater.from(this).inflate(R.layout.view_text_input, actionContainer);
    ((android.widget.ImageButton) (actionContainer.findViewById(R.id.btnSend))).setOnClickListener(this);
    android.widget.EditText etTextInput = ((android.widget.EditText) (actionContainer.findViewById(R.id.etTextInput)));
    etTextInput.requestFocus();
}