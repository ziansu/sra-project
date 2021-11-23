@java.lang.Override
public xl.application.social.whatsup.util.Page<xl.application.social.whatsup.model.feed.entity.FeedEntry> list(int offset, int count) {
    java.util.List<xl.application.social.whatsup.model.feed.entity.FeedEntry> result = entries.stream().skip(offset).limit(count).collect(java.util.stream.Collectors.toList());
    return new xl.application.social.whatsup.util.Page(result, total.intValue(), offset, count);
}