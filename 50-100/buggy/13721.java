public void setCurPosition(int position) {
    if (!(isFinishAnim))
        return ;
    
    this.position = position;
    if ((adapter) != null) {
        adapter.onChangePosition(((org.looa.demoaboutlayout.StickyPageView.ViewHolder) (getPageFill().getTag())), position, true);
    }
}