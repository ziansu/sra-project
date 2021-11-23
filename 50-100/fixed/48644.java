public float sumConsuptionAbove() {
    float sum = 0.0F;
    float mid = midConsumptionValue();
    for (by.tarif.web.databuffer.Register register : this.list) {
        if ((register.getConsumption()) >= mid) {
            sum += register.getConsumption();
        }
    }
    return sum;
}