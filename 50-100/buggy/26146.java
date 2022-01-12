private void display() {
    if (jp.honkot.exercize.calculator.MainActivity.DEBUG)
        java.lang.System.out.println(this);
    
    if (!(jp.honkot.exercize.calculator.sub.MainService.HistoryController.isEqualLast())) {
        mViews.display(inputNumber);
    }else {
        if (jp.honkot.exercize.calculator.sub.MainService.HistoryController.isEqualLast()) {
            mViews.display(jp.honkot.exercize.calculator.sub.MainService.HistoryController.calculate());
        }else {
            mViews.display(inputNumber);
        }
    }
    mViews.putHistory(jp.honkot.exercize.calculator.sub.MainService.HistoryController.getHistoryString());
}