public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (resultCode) {
        case com.demo.MiniMp4Activity.OK :
            if (data != null) {
                context.success(data.getStringExtra("path"));
                android.widget.Toast.makeText(cordova.getActivity(), data.getStringExtra("path").toString(), Toast.LENGTH_SHORT).show();
            }
            break;
        default :
            context.success("null");
            break;
    }
}