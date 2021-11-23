public void addBread(java.lang.String name) throws cal.bread.dan.breadcalculator2.ListFullException {
    if ((size) < 6) {
        cal.bread.dan.breadcalculator2.Bread newBread = new cal.bread.dan.breadcalculator2.Bread(name);
        breadList.add(newBread);
        totalPercentage += newBread.getPercentage();
        cost += levelCost.get(star);
        totalTrain += newBread.getTrain();
        (size)++;
    }else {
        throw new cal.bread.dan.breadcalculator2.ListFullException();
    }
}