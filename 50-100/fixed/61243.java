@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.lang.String> baseEntityIds) {
    super.onPostExecute(baseEntityIds);
    if (baseEntityIds == null) {
        baseEntityIds = new java.util.ArrayList<>();
    }
    org.ei.opensrp.path.view.SiblingPicturesGroup siblingPicturesGroup = ((org.ei.opensrp.path.view.SiblingPicturesGroup) (this.findViewById(R.id.sibling_pictures)));
    siblingPicturesGroup.setSiblingBaseEntityIds(this, baseEntityIds);
}