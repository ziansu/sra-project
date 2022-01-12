@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    findViewById(R.id.need_help_text).setOnClickListener(new uk.co.armedpineapple.cth.wizard.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent browserIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(ctx.getResources().getString(R.string.full_version_url)));
            ctx.startActivity(browserIntent);
        }
    });
}