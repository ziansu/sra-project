public void hide() {
    if ((notify) == null)
        return ;
    
    notificationManager.cancel(nfyId);
    notify = null;
}