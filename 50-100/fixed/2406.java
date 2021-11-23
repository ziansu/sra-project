private static void setDownAnimation(com.esbjon.entities.HeaderFlag.HeaderColor color, boolean flip, com.badlogic.gdx.graphics.g2d.Animation animation) {
    switch (color) {
        case GREY :
            if (flip)
                com.esbjon.entities.HeaderFlag.greyBackgdDown_flipped = animation;
            else
                com.esbjon.entities.HeaderFlag.greyBackgdDown = animation;
            
            break;
        case BLUE :
            if (flip)
                com.esbjon.entities.HeaderFlag.blueBackgdDown_flipped = animation;
            else
                com.esbjon.entities.HeaderFlag.blueBackgdDown = animation;
            
            break;
        case GREEN :
            if (flip)
                com.esbjon.entities.HeaderFlag.greenBackgdDown_flipped = animation;
            else
                com.esbjon.entities.HeaderFlag.greenBackgdDown = animation;
            
            break;
        default :
            if (flip)
                com.esbjon.entities.HeaderFlag.redBackgdDown_flipped = animation;
            else
                com.esbjon.entities.HeaderFlag.redBackgdDown = animation;
            
    }
}