@javax.annotation.PostConstruct
@java.lang.Override
protected void init() {
    try {
        list = new javax.faces.model.ListDataModel(dao.listAll(0, java.lang.Integer.MAX_VALUE));
        comments = new javax.faces.model.ListDataModel(daoComment.listAll(0, java.lang.Integer.MAX_VALUE));
    } catch (br.com.codecode.workix.core.exceptions.NotImplementedYetException e) {
        e.printStackTrace();
    }
}