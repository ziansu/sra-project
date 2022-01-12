@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    nameTv = ((android.widget.TextView) (findViewById(R.id.name)));
    ageTv = ((android.widget.TextView) (findViewById(R.id.age)));
    avatarIv = ((com.youxing.common.views.CircleImageView) (findViewById(R.id.avatar)));
    avatarIv.setDefaultImageResId(R.drawable.ic_default_avatar);
    editBtn = ((android.view.View) (findViewById(R.id.edit)));
    editBtn.setOnClickListener(this);
}