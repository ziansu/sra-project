public void checkKeys() {
    if (de.ImOlli.managers.KeyCheckManager.keysCheck(java.awt.event.KeyEvent.VK_W)) {
        moveDir = javafx.geometry.Side.TOP;
    }else
        if (de.ImOlli.managers.KeyCheckManager.keysCheck(java.awt.event.KeyEvent.VK_S)) {
            moveDir = javafx.geometry.Side.BOTTOM;
        }else
            if (de.ImOlli.managers.KeyCheckManager.keysCheck(java.awt.event.KeyEvent.VK_A)) {
                moveDir = javafx.geometry.Side.LEFT;
            }else
                if (de.ImOlli.managers.KeyCheckManager.keysCheck(java.awt.event.KeyEvent.VK_D)) {
                    moveDir = javafx.geometry.Side.RIGHT;
                }else {
                    return ;
                }
            
        
    
}