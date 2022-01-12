private void addSlide() {
    slideList.add(new javafx.model.Slide(("Slide #" + ((slideList.size()) + 1))));
    sliderTable.getSelectionModel().select(slideList.get(((slideList.size()) - 1)));
}