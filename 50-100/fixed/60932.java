public static void animateHand(char direction) {
    if (com.ahtsho.labyrinthandroid.service.AnimationService.animateHand) {
        if (direction == (infrastructure.Cell.NORTH))
            com.ahtsho.labyrinthandroid.service.AnimationService.yAnimiateHand -= com.ahtsho.labyrinthandroid.service.AnimationService.HAND_ANIMIATION_STEP;
        
        if (direction == (infrastructure.Cell.SOUTH))
            com.ahtsho.labyrinthandroid.service.AnimationService.yAnimiateHand += com.ahtsho.labyrinthandroid.service.AnimationService.HAND_ANIMIATION_STEP;
        
        if (direction == (infrastructure.Cell.WEST))
            com.ahtsho.labyrinthandroid.service.AnimationService.xAnimiateHand -= com.ahtsho.labyrinthandroid.service.AnimationService.HAND_ANIMIATION_STEP;
        
        if (direction == (infrastructure.Cell.EAST))
            com.ahtsho.labyrinthandroid.service.AnimationService.xAnimiateHand += com.ahtsho.labyrinthandroid.service.AnimationService.HAND_ANIMIATION_STEP;
        
    }
}