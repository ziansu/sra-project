public void setCurPosition(int position) {
    if (!(isFinishAnim))
        return ;
    
    this.position = position;
    adapter.onChangePosition(((org.looa.demoaboutlayout.StickyPageView.ViewHolder) (getPageFill().getTag())), position, true, false);
}