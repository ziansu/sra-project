public void refreshMessage() {
    if ((com.example.bsa.boyscouts.SocialMedia.StaticMessage.getCurrentMessage()) != null) {
        android.view.View v = getView();
        android.widget.LinearLayout messageLayout = ((android.widget.LinearLayout) (v.findViewById(R.id.MessagesLayout)));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        createMessageTable();
        textView.setText(com.example.bsa.boyscouts.SocialMedia.Messaging_Fragment.sB.toString());
        messageLayout.addView(textView);
        com.example.bsa.boyscouts.SocialMedia.StaticMessage.setCurrentMessage(null);
    }
}