public void loadFirstAvailable(net.dean.jraw.paginators.Sorting sorting, net.dean.jraw.paginators.TimePeriod timePeriod) {
    java.util.List<com.gmail.jorgegilcavazos.ballislife.features.model.wrapper.CustomSubmission> submissions = postsRepository.getCachedSubmissions();
    if (submissions.isEmpty()) {
        resetLoaderFromStartWithParams(sorting, timePeriod);
        loadPosts(true);
    }else {
        view.showPosts(submissions, true);
    }
}