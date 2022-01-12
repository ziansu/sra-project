@java.lang.Override
public void animIdle(java.awt.Point direction) {
    int x = direction.x;
    int y = direction.y;
    if (x < 0)
        this.spriteManager.setType("left");
    else
        if (x > 0)
            this.spriteManager.setType("right");
        else
            if (y < 0)
                this.spriteManager.setType("up");
            else
                if (y > 0)
                    this.spriteManager.setType("down");
                
            
        
    
}