public java.lang.String getImageUrl(int position) {
    java.lang.String[] urls = DbSupport.list.get(position).imgUrl.split(" ");
    return urls[0];
}