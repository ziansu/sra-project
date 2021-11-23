@java.lang.Override
public boolean evaluate(com.rometools.rome.feed.synd.SyndEntry object) {
    if ((object.getPublishedDate()) == null) {
        return true;
    }
    return (object.getPublishedDate().compareTo(relevantDate)) >= 0;
}