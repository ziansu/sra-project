void loadComments(com.tpb.projects.data.models.Comment[] comments) {
    if ((mData.size()) == 0) {
        mData = new java.util.ArrayList(java.util.Arrays.asList(comments));
        notifyDataSetChanged();
    }else {
        mData.addAll(java.util.Arrays.asList(comments));
        java.util.Collections.sort(mData, comparator);
    }
}