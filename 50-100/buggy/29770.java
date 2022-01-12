private void toSubmitTrumpetActivityReply() {
    android.content.Intent intent = new android.content.Intent(getContext(), jthd.trumpeter.SubmitTrumpetActivity.class);
    intent.putExtra("trumpetUsername", username);
    intent.putExtra("trumpetID", trumpet.getString("trumpetID"));
    getContext().startActivity(intent);
}