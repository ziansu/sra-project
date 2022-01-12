@java.lang.Override
public void run() {
    com.phicdy.mycuration.rss.RssParser parser = new com.phicdy.mycuration.rss.RssParser(context);
    parser.parseXml(in, feedId);
    new com.phicdy.mycuration.filter.FilterTask(context).applyFiltering(feedId);
    try {
        in.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    finishOneRequest();
    com.phicdy.mycuration.rss.UnreadCountManager.getInstance(context).refreshConut(feedId);
    context.sendBroadcast(new android.content.Intent(com.phicdy.mycuration.task.NetworkTaskManager.FINISH_UPDATE_ACTION));
}