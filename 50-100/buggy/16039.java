@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, oneBill.presentation.Account.class);
    intent.putExtra("name", existedbook.get(((v.getId()) / 4)));
    java.lang.System.out.println(existedbook.get(((v.getId()) / 4)));
    startActivity(intent);
}