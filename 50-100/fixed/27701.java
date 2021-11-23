public com.example.kingd.hello_world.History getCurrentEvent() {
    int i = 0;
    if (((homePage.dbFetch.getPast().size()) != 0) && ((homePage.dbFetch.getCurrentDate().compareTo(homePage.dbFetch.getPast().get(0).getPaymentDate())) == 0)) {
        return homePage.dbFetch.getPast().get(0);
    }else {
        return null;
    }
}