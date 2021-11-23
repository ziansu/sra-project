public void draw(org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    immagine.draw(ostr.getX(), ostr.getY(), width, height);
    if ((bubbleMaster.Start.editGame) == 1)
        if (checkInsert)
            if (!(insert))
                immagine.draw(ostr.getX(), ostr.getY(), width, height, cr);
            else
                immagine.draw(ostr.getX(), ostr.getY(), width, height, cg);
            
        
    
}