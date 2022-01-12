@java.lang.Override
public void accept(twitter4j.Status arg0) {
    if (((params.getAccounts()) != null) && (!(params.getAccounts().isEmpty()))) {
        if (params.getAccounts().contains(arg0.getUser().getScreenName())) {
            tweetInfo.add(arg0);
        }
    }else
        tweetInfo.add(arg0);
    
}