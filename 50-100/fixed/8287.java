public java.util.ArrayList<java.lang.String> getCategories(java.util.ArrayList<com.fromdev.android.entity.Question> questionList) {
    java.util.ArrayList<java.lang.String> mCNameList = new java.util.ArrayList<>();
    for (int i = 0; (questionList != null) && (i < (questionList.size())); i++) {
        if (!(mCNameList.contains(questionList.get(i).getCategory())))
            mCNameList.add(questionList.get(i).getCategory());
        
    }
    return mCNameList;
}