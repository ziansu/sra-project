public void addBread(cal.bread.dan.breadcalculator2.Bread bread) throws cal.bread.dan.breadcalculator2.ListFullException {
    if ((size) < 6) {
        breadList.add(bread);
        totalPercentage += bread.getPercentage();
        cost += levelCost.get(star);
        totalTrain += bread.getTrain();
        (size)++;
    }else {
        throw new cal.bread.dan.breadcalculator2.ListFullException();
    }
}