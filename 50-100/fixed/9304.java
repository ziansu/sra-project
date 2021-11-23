@java.lang.Override
public void onJoystickCrossMoved(int direction, int id) {
    switch (direction) {
        case 0 :
            t.s.o.r.f.frost.MainActivity.sendMe = "hai";
            break;
        case 1 :
            t.s.o.r.f.frost.MainActivity.sendMe = "x002?";
            break;
        case 2 :
            t.s.o.r.f.frost.MainActivity.sendMe = "y002?";
            break;
        case 3 :
            t.s.o.r.f.frost.MainActivity.sendMe = "x001?";
            break;
        case 4 :
            t.s.o.r.f.frost.MainActivity.sendMe = "y001?";
            break;
    }
}