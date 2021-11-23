@org.junit.Test
@org.springframework.test.annotation.Rollback(value = false)
public void addRootNodeTest() {
    try {
        addRootNode();
    } catch (org.lenzi.fstore.service.exception.ServiceException e) {
        logger.error(e.getMessage());
    }
}