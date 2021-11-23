public void handle(se.kth.news.core.news.NewsComp.SendTimeout event) {
    if ((java.lang.Math.random()) >= (se.kth.news.core.news.NewsComp.SEND_MESSSAGE_PROBABILITY)) {
        sendNews();
    }
}