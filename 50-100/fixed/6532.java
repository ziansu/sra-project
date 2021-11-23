public void onConfirm() {
    if (writingImageView.isAnytingDrawn()) {
        if (((currentGuideTypeIndex) + 1) < (com.jane.antonio.pishuvalko.controllers.GameController.GAME_GUIDE_TYPES.length)) {
            onErase();
            showNextGuideType();
        }else
            if (characterIterator.hasNext()) {
                saveCurrentSolution();
                onErase();
                showNextCharacter();
            }else {
                saveCurrentSolution();
                onClose();
            }
        
    }
}