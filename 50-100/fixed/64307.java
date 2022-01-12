private void moveCursor(java.lang.String s, java.awt.Point cursor) {
    if (s.equals("up")) {
        cursor.y -= 1;
    }else
        if (s.equals("down")) {
            cursor.y += 1;
        }else
            if (s.equals("left")) {
                cursor.x -= 1;
            }else
                if (s.equals("right")) {
                    cursor.x += 1;
                }
            
        
    
}