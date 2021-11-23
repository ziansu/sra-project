@java.lang.Override
public void modify(ru.kamisempai.livewallpaperstars.sprite.ISprite sprite, long timeDelta) {
    if ((mTimeElapsed) < (mTime)) {
        mTimeElapsed += timeDelta;
        if (((mCompletionListener) != null) && ((mTimeElapsed) >= (mTime)))
            mCompletionListener.onComplete(this);
        
    }
}