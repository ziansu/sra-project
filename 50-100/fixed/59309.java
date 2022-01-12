private void onFinished() {
    if (currentIsLast()) {
        state = org.geepawhill.contentment.model.PlayState.After;
    }else {
        if (isChaining) {
            current += 1;
            playCurrent();
        }else {
            current += 1;
            if (!(currentIsMarked())) {
                playCurrent();
            }else
                state = org.geepawhill.contentment.model.PlayState.Before;
            
        }
    }
}