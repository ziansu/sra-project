public void updatePosition(com.krishagni.catissueplus.core.administrative.domain.StorageContainerPosition newPosition) {
    if (((newPosition != null) && ((newPosition.getPosOneOrdinal()) == 0)) && ((newPosition.getPosTwoOrdinal()) == 0)) {
        newPosition = null;
    }
    transferTo(newPosition, null);
}