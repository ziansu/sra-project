private int antiClockwise(int dir) {
    if ((mazeType) == 2) {
        if (dir == 5)
            return 0;
        else
            return ++dir;
        
    }else {
        switch (dir) {
            case 0 :
                return 2;
            case 2 :
                return 3;
            case 3 :
                return 5;
            case 5 :
                return 0;
        }
    }
    return -1;
}