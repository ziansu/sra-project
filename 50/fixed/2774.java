public boolean addWater(int liters) {
    int newAmountInLiters = (currentAmountInLiters) + liters;
    if (newAmountInLiters >= (maxCapacityInLiters)) {
        currentAmountInLiters = maxCapacityInLiters;
        return true;
    }else {
        currentAmountInLiters = newAmountInLiters;
        return false;
    }
}