@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (((android.widget.TextView) (view)).getText().toString().equals("ΕΠΙΣΤΡΟΦΗ")) {
        android.content.Intent intent = new android.content.Intent(this, com.example.marios.mathlearn.MainActivity.class);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.example.marios.mathlearn.ProvolhAnakoinwshs.class);
        intent.putExtra("str2", anakoinwseis[position]);
        startActivity(intent);
    }
}