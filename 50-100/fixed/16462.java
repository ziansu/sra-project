public void startListen(java.awt.Rectangle rect, int range, java.util.List<ComponentManager> income, java.util.List<ComponentManager> expense, int yMax) {
    this.initRect = new java.awt.Rectangle(rect);
    this.range = range;
    this.income = income;
    this.expense = expense;
    this.maxCount = 5;
    this.hiddenCount = 0;
    this.scroll.addAdjustmentListener(this);
    update();
    normalizeComponents();
}