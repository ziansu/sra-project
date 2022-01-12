public void addPost(com.example.elenahorton.mobilefinalproject.model.Post place, java.lang.String key) {
    if (!(postKeys.contains(key))) {
        if ((type) == 0) {
            if (filters.contains(place.getCategory())) {
                postList.add(place);
                postKeys.add(key);
                notifyDataSetChanged();
            }
        }else {
            postList.add(place);
            postKeys.add(key);
            notifyDataSetChanged();
        }
    }
}