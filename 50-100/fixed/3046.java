@java.lang.Override
public void revealAgar() {
    int revealedAgar = 0;
    for (com.golden.gamedev.object.Sprite agarSprite : agarGroup.getSprites()) {
        if ((agarSprite != null) && (!(agarSprite.isActive()))) {
            agarSprite.setActive(true);
            revealedAgar++;
            if (revealedAgar == 10) {
                break;
            }
        }
    }
}