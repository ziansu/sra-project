@java.lang.Override
public void onClick(android.view.View v) {
    if ((id.getText().toString().equals("manzi")) && (password.getText().toString().equals("0815")));
    {
        android.content.Intent intent = new android.content.Intent(this, kr.p_e.mprof.hungry_panda.ReguralActivity.class);
        startActivity(intent);
    }
}