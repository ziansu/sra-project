public double drink(double toDrink) {
    return ((this.amount) - toDrink) > (ph.edu.mobapde.meditake.meditake.beans.Medicine.NOT_ENOUGH) ? (this.amount) - toDrink : ph.edu.mobapde.meditake.meditake.beans.Medicine.NOT_ENOUGH;
}