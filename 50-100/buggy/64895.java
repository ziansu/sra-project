protected void updateCustomFrame() {
    if ((currentFrame) == (customFrameList.size())) {
        if (!(spriteLoop))
            return ;
        
        currentFrame = com.daasuu.library.constant.Constant.DEFAULT_CURRENT_FRAME;
        dx = 0;
        dy = 0;
        return ;
    }
    int currentNum = customFrameList.get(((currentFrame) - 1));
    dx = (frameWidth) * (currentNum % (frameNumPerLine));
    dy = (frameHeight) * (currentNum / (frameNumPerLine));
    (currentFrame)++;
}