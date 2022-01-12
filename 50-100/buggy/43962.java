public void draw_user(android.graphics.Canvas canvas) {
    if (((user_pos_x) != (-999)) && ((user_pos_y) != (-999))) {
        p.setColor(Color.RED);
        canvas.drawCircle(((float) (user_pos_x)), ((float) (user_pos_y)), 40, p);
    }
}