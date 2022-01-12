private void completeSignInProcess(boolean finish) {
    this.hideProgress();
    if (finish)
        this.onLoginFragmentListener_.onLoginComplete(this);
    
}