public java.util.List<partypeople.Comment> getComments() {
    java.util.ArrayList<partypeople.Comment> result = new java.util.ArrayList<partypeople.Comment>();
    if ((comments) != null) {
        for (com.googlecode.objectify.Ref<partypeople.Comment> comment : comments) {
            result.add(comment.safeGet());
        }
    }
    return result;
}