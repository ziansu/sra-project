public void onConfirm() {
    if (writingImageView.isAnytingDrawn()) {
        onErase();
        if (((currentGuideTypeIndex) + 1) < (com.jane.antonio.pishuvalko.controllers.GameController.GAME_GUIDE_TYPES.length)) {
            showNextGuideType();
        }else
            if (characterIterator.hasNext()) {
                saveCurrentSolution();
                showNextCharacter();
            }else {
                onClose();
            }
        
    }
}