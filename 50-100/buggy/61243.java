@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.lang.String> baseEntityIds) {
    super.onPostExecute(baseEntityIds);
    if (baseEntityIds != null) {
    }
    org.ei.opensrp.path.view.SiblingPicturesGroup siblingPicturesGroup = ((org.ei.opensrp.path.view.SiblingPicturesGroup) (this.findViewById(R.id.sibling_pictures)));
    java.util.ArrayList<java.lang.String> test = new java.util.ArrayList<>();
    test.add("07a0f2fd-ee9f-4bdf-8841-1acfb4b0748a");
    siblingPicturesGroup.setSiblingBaseEntityIds(this, test);
}