@javax.annotation.PostConstruct
@java.lang.Override
protected void init() {
    try {
        list = new javax.faces.model.ListDataModel<br.com.codecode.workix.jpa.models.Blog>(dao.listAll(0, java.lang.Integer.MAX_VALUE));
        comments = new javax.faces.model.ListDataModel<br.com.codecode.workix.jpa.models.Comment>(daoComment.listAll(0, java.lang.Integer.MAX_VALUE));
    } catch (br.com.codecode.workix.core.exceptions.NotImplementedYetException e) {
        e.printStackTrace();
    }
}