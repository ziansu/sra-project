@java.lang.Override
public hr.karlovrbic.notify.v1.model.json.CommentJson get(java.lang.Long id) {
    hr.karlovrbic.notify.v1.model.entity.Comment comment = hr.karlovrbic.notify.v1.dao.manager.JPAEMProvider.getEntityManager().find(hr.karlovrbic.notify.v1.model.entity.Comment.class, id);
    hr.karlovrbic.notify.v1.model.json.CommentJson commentJson = null;
    if ((com.sun.org.apache.xml.internal.serializer.utils.Utils.messages) != null) {
        commentJson = comment.toJson();
    }
    hr.karlovrbic.notify.v1.dao.manager.JPAEMProvider.close();
    return commentJson;
}