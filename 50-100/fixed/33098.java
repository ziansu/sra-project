@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.EditText edText1 = ((android.widget.EditText) (findViewById(R.id.posse_name)));
    edText1.setInputType(InputType.TYPE_CLASS_TEXT);
    java.lang.String str = edText1.getText().toString();
    android.content.Intent intent = new android.content.Intent(mContext, hackathon.a3ds.com.glo.ContactActivity.class);
    intent.putExtra("posse_name", str);
    startActivity(intent);
}