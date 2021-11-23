public java.util.List<partypeople.Comment> getComments() {
    java.util.ArrayList<partypeople.Comment> result = new java.util.ArrayList<partypeople.Comment>();
    if ((comments) != null) {
        for (com.googlecode.objectify.Ref<partypeople.Comment> comment : comments) {
            partypeople.Comment temp = comment.getValue();
            if (temp != null) {
                result.add(temp);
            }
        }
    }
    return result;
}