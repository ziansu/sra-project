public void setMode(com.frostwire.android.gui.views.TransfersNoSeedsView.Mode mode) {
    this.mode = mode;
    bottomTextView.setText(R.string.the_more_you_give_the_more_you_receive);
    switch (mode) {
        case INACTIVE :
            setVisibility(View.GONE);
            break;
        case SEEDING_DISABLED :
            topTextView.setText(R.string.seeding_is_currently_disabled);
            midBoldTextView.setText(R.string.seeding_keeps_the_network_healthy);
            button.setText(R.string.enable_seeding);
            setVisibility(com.frostwire.android.gui.views.VISIBLE);
            break;
        case SEED_ALL_FINISHED :
            topTextView.setText(R.string.nothing_is_currently_seeding);
            midBoldTextView.setText(R.string.would_you_like_to_seed_your_finished_torrent_transfers);
            button.setText(R.string.seed_all_finished);
            setVisibility(com.frostwire.android.gui.views.VISIBLE);
            break;
    }
}