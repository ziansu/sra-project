@java.lang.Override
public void dislike(java.util.Collection<model.Paper> keys, model.Paper recommended) {
    java.lang.String keyword = toString(keys, recommended);
    if (!(dislikeMap.containsKey(keyword))) {
        dislikeMap.put(keyword, 0);
    }
    dislikeMap.put(keyword, ((dislikeMap.get(keyword)) + 1));
}