public void show(com.rfo.basic.GR.VISIBLE show) {
    switch (show) {
        case SHOW :
            mVisible = true;
            break;
        case HIDE :
            mVisible = false;
            break;
        case TOGGLE :
            mVisible = !(mVisible);
            break;
    }
}