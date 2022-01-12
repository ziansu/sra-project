private void changeFabColor(java.util.List<site.iurysouza.cinefilo.presentation.medias.filter.GenderEnum> genderList) {
    new android.os.Handler().postDelayed(() -> {
        if (genderList.isEmpty()) {
            filterFab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(defaultColor));
            return ;
        }
        filterFab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(selectedColor));
    }, site.iurysouza.cinefilo.presentation.medias.filter.FilterViewManager.BLUR_VIEW_HIDE_DELAY);
}