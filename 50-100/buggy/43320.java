@javax.annotation.PostConstruct
public void init() {
    java.lang.System.out.println("->ClienteMB: init.");
    try {
        entityList = com.pmarlen.backend.dao.ClienteDAO.getInstance().findAll();
    } catch (com.pmarlen.backend.dao.DAOException de) {
        logger.severe(de.getMessage());
        entityList = new java.util.ArrayList<com.pmarlen.backend.model.quickviews.ClienteQuickView>();
    }
    java.lang.System.out.println(("->ClienteMB: init:entityList=" + (entityList)));
    viewRows = 10;
    dialogTitle = "DATOS DEL CLIENTE";
}