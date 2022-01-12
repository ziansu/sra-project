@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public void saveFail(cz.jiripinkas.jba.entity.Blog blog, java.lang.String errorText) {
    int errorCount = 0;
    if ((blog.getLastCheckErrorCount()) != null) {
        errorCount = blog.getLastCheckErrorCount();
    }
    blog.setLastCheckErrorCount((errorCount + 1));
    blogRepository.saveFail(blog.getId(), errorCount, errorText);
}