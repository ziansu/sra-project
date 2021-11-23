@org.springframework.web.bind.annotation.GetMapping(value = "/twitter/most-used-hash-tags-all")
public java.util.List<edu.christophstach.datasciencestudioustribble.model.diagram.HashTagOccurrence> mostUsedHashTagsAll(@org.springframework.web.bind.annotation.RequestParam(value = "fromDate", required = false)
@org.springframework.format.annotation.DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
java.time.Instant from, @org.springframework.web.bind.annotation.RequestParam(value = "toDate", required = false)
@org.springframework.format.annotation.DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
java.time.Instant to, @org.springframework.web.bind.annotation.RequestParam(value = "count", required = false, defaultValue = "50")
java.lang.Integer count) {
    final long timeStart = java.lang.System.currentTimeMillis();
    java.util.List<edu.christophstach.datasciencestudioustribble.model.diagram.HashTagOccurrence> result = tweetRepository.getHashTagOccurrences(from, to, count, null);
    final long timeEnd = java.lang.System.currentTimeMillis();
    edu.christophstach.datasciencestudioustribble.controller.TwitterController.logger.info(java.lang.String.format(java.util.Locale.GERMANY, "Zeit der Anfrage 'most-used-hash-tags-all': %,d ms", (timeEnd - timeStart)));
    return result;
}