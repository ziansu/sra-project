@java.lang.Override
public void onClick(android.view.View v) {
    int resultMain = 0;
    if ((count) == 10) {
        for (int i = 0; i < 10; i++) {
        }
        android.widget.Toast.makeText(this, resultMain, Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Please Complete The Test First!!", Toast.LENGTH_SHORT).show();
    }
}