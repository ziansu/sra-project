public void addComment(java.lang.String id, java.lang.String comment) {
    if (!(commentsByRecipeID.containsKey(id))) {
        commentsByRecipeID.put(id, new java.util.ArrayList<java.lang.String>());
    }
    commentsByRecipeID.get(id).add(comment);
}