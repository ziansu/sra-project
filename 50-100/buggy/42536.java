public void onTouchEvent(android.view.MotionEvent event) {
    switch ((event.getAction()) & (android.view.MotionEvent.ACTION_MASK)) {
        case android.view.MotionEvent.ACTION_DOWN :
            if ((scene) != null) {
                (currentImage)++;
                if ((currentImage) > (m360Image.length))
                    currentImage = 0;
                
                scene.removeAllSceneObjects();
                scene.addSceneObject(objects.get(currentImage));
            }
    }
}