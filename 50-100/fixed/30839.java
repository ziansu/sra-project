public void run() {
    if ((_count) == 100) {
        _count = 0;
        userData.setPoints_earned((++(points)));
        myRef.child("point_remainder").setValue(_count);
        userData.setCount_remainder(_count);
        myRef.setValue(userData);
    }
    progress_heart.getBackground().setLevel(((_count) * 100));
}