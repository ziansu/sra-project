@java.lang.Override
public void update(android.graphics.Point point) {
    rectangle.set(((point.x) - ((rectangle.width()) / 2)), ((point.y) - ((rectangle.height()) / 2)), ((point.x) - ((rectangle.width()) / 2)), ((point.y) + ((rectangle.height()) / 2)));
}