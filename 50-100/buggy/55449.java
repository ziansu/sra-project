@java.lang.Override
protected void populateView(android.view.View v, com.example.luis.nanochat.models.ChatMessage model) {
    ((android.widget.TextView) (v.findViewById(android.R.id.text1))).setText(model.getUserName());
    ((android.widget.TextView) (v.findViewById(android.R.id.text2))).setText(model.getText());
    data.setUserName(model.getUserName());
    data.setEmail(model.getName());
}