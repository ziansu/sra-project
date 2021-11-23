@java.lang.Override
public void onAreaTouched(org.test.Event e, float touchX, float touchY) {
    if (e == (Event.DOWN)) {
        if (!(back.contains(touchX, touchY))) {
            loon.component.LSelectorIcon selectIcon = new loon.component.LSelectorIcon(touchX, touchY, 48);
            selectIcon.setBackgroundColor(LColor.blue);
            selectIcon.setBorderColor(LColor.red);
            add(selectIcon);
        }
    }
}