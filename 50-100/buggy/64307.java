private void moveCursor(java.lang.String s, java.awt.Point cursor) {
    switch (s) {
        case "up" :
            cursor.y -= 1;
            break;
        case "down" :
            cursor.y += 1;
            break;
        case "left" :
            cursor.x -= 1;
            break;
        case "right" :
            cursor.x += 1;
            break;
    }
}