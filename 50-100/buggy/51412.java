private void move(double delta, int span, se.chalmers.get_rect.utilities.Point velocity) {
    if (delta <= (-span)) {
        cameraAdapter.translate(velocity);
        cameraPos = cameraPos.add(velocity);
    }else
        if (delta >= span) {
            cameraAdapter.translate(velocity.inverse());
            cameraPos = cameraPos.subtract(velocity);
        }
    
}