@java.lang.Override
public void onClick(android.view.View v) {
    if (!(b1.getText().equals(""))) {
        if ((tag_num) >= 6) {
            android.widget.Toast.makeText(getApplicationContext(), "最多添加6个标签！", Toast.LENGTH_SHORT).show();
            return ;
        }
        b1.setVisibility(View.GONE);
        B1.setVisibility(View.VISIBLE);
        B1.setText(b1.getText());
        (tag_num)++;
    }
}