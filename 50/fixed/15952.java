public void movement(java.lang.String move) {
    switch (move) {
        case "north" :
            (y)++;
        case "east" :
            (x)++;
        case "south" :
            (v)--;
        case "west" :
            (x)--;
    }
}