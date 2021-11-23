public void done(java.util.List<com.tomaszow.hackathon.hackathon.model.Measurement> itemList, com.parse.ParseException e) {
    if (e == null) {
        java.lang.String firstItemId = itemList.get(0).getObjectId();
        mProgressStatus = itemList.size();
        nearbyPeople.addAll(itemList);
        mProgress.setVisibility(View.INVISIBLE);
    }else {
        android.util.Log.d("item", ("Error: " + (e.getMessage())));
    }
}