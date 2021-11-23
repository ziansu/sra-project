public void replacePlayer() {
    android.view.ViewGroup.LayoutParams currLP = this.parentViewController.getLayoutParams();
    android.view.ViewGroup.LayoutParams lp = new android.view.ViewGroup.LayoutParams(currLP.width, currLP.height);
    this.parentViewController.addView(((android.view.View) (this.player)), 1, lp);
}