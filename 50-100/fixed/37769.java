public void deleteMediaPlanItem(java.lang.Integer mediaPlanId, java.lang.Integer itemId) throws java.lang.Exception {
    com.val.jqgrid.demo.dao.mock.DataStore.LOG.debug("inside deleteMediaPlanItem");
    if ((list.containsKey(mediaPlanId)) == false) {
        throw new java.lang.Exception("Media Plan not found");
    }
    com.val.jqgrid.demo.view.MediaPlan mediaPlan = list.get(mediaPlanId);
    java.util.Map<java.lang.Integer, com.val.jqgrid.demo.view.Item> itemMap = mediaPlan.getItemMap();
    itemMap.remove(itemId);
    list.put(mediaPlanId, mediaPlan);
}