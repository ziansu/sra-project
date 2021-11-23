public void addData(java.util.List<com.media2359.example.JobModel> data) {
    if ((data != null) && ((data.isEmpty()) == false)) {
        jobModels.addAll(data);
        notifyDataSetChanged();
    }
}