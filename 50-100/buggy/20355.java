public static boolean isAlreadyAdded(int questionId) {
    java.util.List<com.ankur.assessment.model.Item> items = new com.activeandroid.query.Select().from(com.ankur.assessment.model.Item.class).execute();
    for (com.ankur.assessment.model.Item item : items) {
        if ((item.questionId) == questionId) {
            return true;
        }
    }
    return false;
}