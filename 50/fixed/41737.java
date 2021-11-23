@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent addCard = new android.content.Intent(this, org.talcrafts.udhari.QrCodeActivity.class);
    startActivity(addCard);
}