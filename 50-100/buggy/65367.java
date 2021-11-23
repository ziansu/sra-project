private void removeMusicReceiver() {
    if ((this.musicReceiver) != null) {
        try {
            this.cordova.getActivity().unregisterReceiver(this.musicReceiver);
            this.musicReceiver = null;
        } catch (java.lang.Exception e) {
        }
    }
    if ((this.focusListener) != null) {
        this.focusListener.abandonFocus();
        this.focusListener = null;
    }
}