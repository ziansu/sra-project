protected java.awt.Color getButtonColor(final org.jfree.date.SerialDate targetDate) {
    if (targetDate.equals(this.date)) {
        return this.dateButtonColor;
    }else
        if ((targetDate.getMonth()) == (this.date.getMonth())) {
            return this.monthButtonColor;
        }else {
            return this.chosenOtherButtonColor;
        }
    
}