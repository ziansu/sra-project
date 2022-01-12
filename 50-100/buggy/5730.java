@java.lang.Override
public boolean onGesture(com.google.android.glass.touchpad.Gesture gesture) {
    if (gesture == (com.google.android.glass.touchpad.Gesture.TAP)) {
        openOptionsMenu();
        return true;
    }else
        if (gesture == (com.google.android.glass.touchpad.Gesture.TWO_TAP)) {
            return true;
        }else
            if (gesture == (com.google.android.glass.touchpad.Gesture.SWIPE_RIGHT)) {
                return true;
            }else
                if (gesture == (com.google.android.glass.touchpad.Gesture.SWIPE_LEFT)) {
                    return true;
                }else
                    if (gesture == (com.google.android.glass.touchpad.Gesture.SWIPE_DOWN)) {
                        android.widget.Toast.makeText(this, "Swipe down with two fingers to exit", Toast.LENGTH_SHORT).show();
                    }
                
            
        
    
    return false;
}