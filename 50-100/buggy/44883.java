private void initCommentsAndInfo(int idURLParam) {
    setWebsiteId(idURLParam);
    comments = null;
    setComments(commentBean.getCommentsViaWebsite(idURLParam, websiteInfoBean.findBiggestWebsiteId()));
    if ((comments) != null) {
        for (ch.bbc.rottengold.model.Comment c : comments) {
            if ((c.getId_website()) != (websiteId))
                comments = null;
            
        }
        comments = reverseComments(comments);
    }
}