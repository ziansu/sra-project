private void setDataToTheList() {
    if (!(com.kapuwelfare.utility.Utility.isValueNullOrEmpty(newsModel.getNewsModels().get(0).getImage_name()))) {
        com.kapuwelfare.utility.Utility.URLProfilePicLoading(img_news_home, newsModel.getNewsModels().get(0).getImage_name(), null, R.drawable.place_holder);
        txt_home_heading.setText(newsModel.getNewsModels().get(0).getTitle());
    }
    setRemainingData();
}