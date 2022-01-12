private void initViews(android.content.Context context) {
    inflate(context, R.layout.fab_options_layout, this);
    mIsOpen = false;
    mBackground = findViewById(R.id.background);
    mFloatingActionButton = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab_options_fab)));
    mFloatingActionButton.setOnClickListener(this);
    mFloatingActionButton.setVisibility(com.toolbox.kostovtd.fabOptions.GONE);
    mButtonContainer = ((com.toolbox.kostovtd.fabOptions.FabOptionsButtonContainer) (findViewById(R.id.button_container)));
}