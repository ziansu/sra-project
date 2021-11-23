@org.springframework.web.bind.annotation.RequestMapping(value = "/byAuthor")
public org.springframework.http.ResponseEntity<java.lang.Object> findByAuthor(@org.springframework.web.bind.annotation.RequestParam(name = "author", required = false)
java.lang.String author, @org.springframework.web.bind.annotation.RequestParam(name = "skip", required = false)
int skip) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(author)) {
        java.util.List<java.lang.String> topicList = topicRepository.findByAuthorOrderByCreatedDesc(author, skip);
        if ((null != topicList) && ((topicList.size()) > 0)) {
            return com.starkinc.stopic.util.ServiceUtil.buildEntity(org.springframework.http.HttpStatus.FOUND, topicList);
        }else {
            return noRecordFound;
        }
    }else {
        return topicSearchValidation;
    }
}