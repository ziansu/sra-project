private void setJoinButtonText() {
    if (!(past)) {
        if (joined)
            btnJoin.setText(getString(R.string.leave_event));
        else
            btnJoin.setText(getString(R.string.join_event));
        
    }else {
        if (joined) {
            if (liked)
                btnJoin.setText(getString(R.string.like_event));
            else
                btnJoin.setText(R.string.unlike_event);
            
            btnJoin.setClickable(true);
        }else {
            btnJoin.setText(getString(R.string.event_passed));
            btnJoin.setClickable(false);
        }
    }
}