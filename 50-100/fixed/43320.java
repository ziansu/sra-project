@javax.annotation.PostConstruct
public void init() {
    logger.info("->ClienteMB: init.");
    try {
        entityList = com.pmarlen.backend.dao.ClienteDAO.getInstance().findAll();
    } catch (com.pmarlen.backend.dao.DAOException de) {
        logger.severe(de.getMessage());
        entityList = new java.util.ArrayList<com.pmarlen.backend.model.quickviews.ClienteQuickView>();
    }
    logger.info(("->ClienteMB: init:entityList=" + (entityList)));
    viewRows = 10;
    dialogTitle = "DATOS DEL CLIENTE";
}