public cal.bread.dan.breadcalculator2.TrainingList optimize() {
    if ((sumTrain) <= (totalTrainHas)) {
        return null;
    }else {
        return optimize1(startStar, endStar);
    }
}