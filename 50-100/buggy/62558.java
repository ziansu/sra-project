private int getPosition(int position, java.util.List<com.winsun.fruitmix.mediaModule.model.Media> mediaList, com.winsun.fruitmix.mediaModule.model.Media media) {
    for (int i = 0; i < (mediaList.size()); i++) {
        com.winsun.fruitmix.mediaModule.model.Media media1 = mediaList.get(i);
        if (media.getUuid().equals(media1.getUuid())) {
            position = i;
        }
    }
    return position;
}