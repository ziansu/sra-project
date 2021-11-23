@butterknife.OnClick(value = { R.id.btn_glide , R.id.btn_picasso , R.id.btn_volley , R.id.btn_uil })
public void onViewClicked(android.view.View view) {
    switch (view.getId()) {
        case R.id.btn_glide :
            startActivity(com.example.getimage.activity.GlideActivity.class);
            break;
        case R.id.btn_picasso :
            startActivity(com.example.getimage.activity.PicassoActivity.class);
            break;
        case R.id.btn_volley :
            startActivity(com.example.getimage.activity.VolleyActivity.class);
            break;
        case R.id.btn_uil :
            startActivity(com.example.getimage.activity.UILActivity.class);
            break;
        default :
            break;
    }
}