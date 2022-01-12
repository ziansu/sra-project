public boolean equals(com.jacksonvillecomedy.broskj.jaxcomedy.Show show) {
    return ((((this.comedian.equals(show.getComedian())) && (this.description.equals(show.getDescription()))) && (this.showDate.equals(show.getShowDate()))) && ((this.showTime) == (show.getShowTime()))) && (this.videoID.equals(show.getVideoID()));
}