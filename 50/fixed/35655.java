@java.lang.Override
protected void onResume() {
    super.onResume();
    reinitTextureView(((android.view.TextureView) (findViewById(R.id.player_texture))));
}