@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    molecule.scale().x += 0.01F;
    molecule.scale().y += 0.01F;
    molecule.scale().z += 0.01F;
}