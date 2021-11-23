public double getAverageDeliveryTime(java.lang.String delDes) {
    int totNum = 0;
    double avTime = 0;
    for (main.logic.MailDelivery m : getMailEvents()) {
        if (m.shortDes().equals(delDes)) {
            totNum++;
            avTime += m.getTimeTaken();
        }
    }
    if (totNum == 0) {
        controller.setAverageDeliveryTime(0);
    }else {
        controller.setAverageDeliveryTime((avTime / totNum));
    }
    return avTime / totNum;
}