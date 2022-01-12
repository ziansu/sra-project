public int runFrame() {
    if (active) {
        switch (controlState) {
            case 0 :
                loadRecorces();
                break;
            case 1 :
                cleanup();
                return 1;
            case 3 :
                combat();
                break;
            case 4 :
                watchAnimation();
                break;
        }
    }
    return -1;
}