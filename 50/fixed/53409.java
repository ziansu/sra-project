@java.lang.Override
public java.util.List<java.lang.Object[]> getParentDetails(final java.lang.String collectionItemId) {
    final java.lang.String sql = ("select cc.gooru_oid as classId, rc.title as classTitle, cp.gooru_oid as pathwayId, rp.title as pathwayTitle, cs.gooru_oid as assignmentId, rs.title as assignmentTitle,cii.narration,cii.planned_end_date,cii.is_required,cii.minimum_score from content cc inner join resource rc on (rc.content_id = cc.content_id) inner join collection_item ci on (ci.collection_content_id = rc.content_id) inner join content cp on (cp.content_id = ci.resource_content_id) inner join resource rp on (rp.content_id = cp.content_id) inner join collection_item cii on (cii.collection_content_id = rp.content_id) inner join content cs on (cs.content_id = cii.resource_content_id) inner join resource rs on (cs.content_id = rs.content_id) where cii.collection_item_id ='" + collectionItemId) + "'";
    final org.hibernate.Query query = getSession().createSQLQuery(sql);
    return query.list();
}