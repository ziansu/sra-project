private void addToList(java.util.ArrayList<org.wso2.siddhi.debs2016.post.PostWindowObject> deductedPosts) {
    java.util.Iterator<org.wso2.siddhi.debs2016.post.PostWindowObject> iterator1 = deductedPosts.iterator();
    while (iterator1.hasNext()) {
        postWindow.add(iterator1.next());
    } 
}