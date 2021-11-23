@java.lang.Override
public void onClick(android.view.View v) {
    (state)++;
    switch (state) {
        default :
            android.content.Intent intent = new android.content.Intent(v.getContext(), com.example.dingfeng.icms.ResultActivity.class);
            android.os.Bundle extras = new android.os.Bundle();
            extras.putString("uri", selectedImage.toString());
            intent.putExtras(extras);
            startActivity(intent);
            break;
    }
}